import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Dice {
	private List<Integer> numbers;
	
	public Dice(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public int getNumber(int index) {
		return numbers.get(index);
	}
}

enum Command {
	N, E, W, S;
	
	public static List<Command> toCommands(String line) {
    	return line.chars()
        		.mapToObj(c -> toCommand((char) c))
        		.collect(Collectors.toList());
	}

	public static Command toCommand(char c) {
		switch (c) {
			case 'N':
				return N;
			case 'E':
				return E;
			case 'W':
				return W;
			case 'S':
				return S;
			default:
				throw new IllegalArgumentException("?????????????????????????????§???: " + c);
		}
    }
}

/**
 * ????¨??±????????????????????????????????????¨?????????
 * <pre>
 *   0
 * 3 1 2 4
 *   5
 * </pre>
 * ??????????????????0???top???2???east???
 */
class DiceState {

	private int top = 0;
	private int south = 1;
	private int east = 2;
	private int west = 3;
	private int north = 4;
	private int bottom = 5;
	
	public DiceState() {
	}
	
	private DiceState(int top, int south, int east, int west, int north, int bottom) {
		this.top = top;
		this.south = south;
		this.east = east;
		this.west = west;
		this.north = north;
		this.bottom = bottom;
	}
	
	public DiceState runCommand(Command command) {
		switch (command) {
			case N:
				return new DiceState(south, bottom, east, west, top, north);
			case S:
				return new DiceState(north, top, east, west, bottom, south);
			case E:
				return new DiceState(west, south, top, bottom, north, east);
			case W:
				return new DiceState(east, south, bottom, top, north, west);
			default:
				throw new IllegalStateException("????????????????????????????????????????£??????????");
		}
	}

	public int getTopNumber(Dice dice) {
		return dice.getNumber(top);
	}

	public int getSouthNumber(Dice dice) {
		return dice.getNumber(south);
	}

	public int getEastNumber(Dice dice) {
		return dice.getNumber(east);
	}
	
	public int getWestNumber(Dice dice) {
		return dice.getNumber(west);
	}

	public int getNorthNumber(Dice dice) {
		return dice.getNumber(north);
	}

	public int getBottomNumber(Dice dice) {
		return dice.getNumber(bottom);
	}

	public static Set<DiceState> allStates() {
		// ??????????????????????????¢??????????????????????????¨??±???????¶????????????????
		// E?????°??????6?????¨??¨????????????N??????????????¢??????4??????????????????????¨?24??±?????????
		List<Command> commands = Command.toCommands("NNNENNNWNNNWNNNENNNENNN");
		Set<DiceState> states = new HashSet<>();
		DiceState state = new DiceState();
		states.add(state);
		for (Command command : commands) {
			state = state.runCommand(command);
			states.add(state);
		}
		return states;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bottom;
		result = prime * result + east;
		result = prime * result + north;
		result = prime * result + south;
		result = prime * result + top;
		result = prime * result + west;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiceState other = (DiceState) obj;
		if (bottom != other.bottom)
			return false;
		if (east != other.east)
			return false;
		if (north != other.north)
			return false;
		if (south != other.south)
			return false;
		if (top != other.top)
			return false;
		if (west != other.west)
			return false;
		return true;
	}
}

class Question {
	int top;
	int south;
	
	public Question(int top, int south) {
		this.top = top;
		this.south = south;
	}
}

public class Main {

	public void run(InputStream in, PrintStream out) {
        Input input = parseInput(in);
        
        if (isEqual(input.dice1, input.dice2)) {
        	out.println("Yes");
        } else {
        	out.println("No");
        }
    }

    private boolean isEqual(Dice dice1, Dice dice2) {
        Set<DiceState> allStates = DiceState.allStates();
        DiceState state1 = allStates.iterator().next();
        return allStates.stream().anyMatch(state2 -> isEqualsDiceNumbers(state1, dice1, state2, dice2));
    }

	private boolean isEqualsDiceNumbers(DiceState state1, Dice dice1, DiceState state2, Dice dice2) {
		return state1.getTopNumber(dice1) == state2.getTopNumber(dice2)
			&& state1.getSouthNumber(dice1) == state2.getSouthNumber(dice2)
			&& state1.getEastNumber(dice1) == state2.getEastNumber(dice2)
			&& state1.getWestNumber(dice1) == state2.getWestNumber(dice2)
			&& state1.getNorthNumber(dice1) == state2.getNorthNumber(dice2)
			&& state1.getBottomNumber(dice1) == state2.getBottomNumber(dice2);
	}

	private Input parseInput(InputStream in) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
	    	Dice dice1 = lineToDice(nextLine(reader, "??????????????¢?????°"));
	    	Dice dice2 = lineToDice(nextLine(reader, "??????????????¢?????°"));
	    	return new Input(dice1, dice2);
        } catch (IOException e) {
    		throw new IllegalArgumentException("??\???????????????????????±???????????????", e);
        }
    }
    
	private Dice lineToDice(String line) {
		String[] numberStrings = line.split(" ");
		if (numberStrings.length != 6) {
    		throw new IllegalArgumentException("??????????????¢?????°????????£??§???: " + line);
		}

		try {
			List<Integer> numbers = Arrays.stream(numberStrings)
				.map(Integer::new)
				.collect(Collectors.toList());
	        return new Dice(numbers);
    	} catch (Exception e) {
    		throw new IllegalArgumentException("??????????????¢?????°????????£??§???: " + line, e);
    	}
	}

	private static class Input {
		Dice dice1;
		Dice dice2;
		
		public Input(Dice dice1, Dice dice2) {
			this.dice1 = dice1;
			this.dice2 = dice2;
		}
	}

    private String nextLine(BufferedReader reader, String label) {
    	String line;
    	try {
        	line = reader.readLine();
    	} catch (Exception e) {
    		throw new IllegalArgumentException(label + "??????????????\???????????????????????????", e);
    	}
    	
    	if (line == null) {
    		throw new IllegalArgumentException(label + "??????????????\????????????????????????");
    	}
    	return line;
    }
    
    public static void main(String[] args) {
        try {
            new Main().run(System.in, System.out);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

}