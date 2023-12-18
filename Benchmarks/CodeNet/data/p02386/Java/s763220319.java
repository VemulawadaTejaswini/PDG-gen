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
import java.util.stream.Stream;

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

class DiceWithEquals {

	private Dice dice;
	private Set<DiceState> allStates;
	
	public DiceWithEquals(Dice dice, Set<DiceState> allStates) {
		this.dice = dice;
		this.allStates = allStates;
	}
	
	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		DiceWithEquals other = (DiceWithEquals) obj;
        DiceState state1 = allStates.iterator().next();
        return allStates.stream().anyMatch(state2 -> isEqualsDiceNumbers(state1, dice, state2, other.dice));
	}
	
	private boolean isEqualsDiceNumbers(DiceState state1, Dice dice1, DiceState state2, Dice dice2) {
		return state1.getTopNumber(dice1) == state2.getTopNumber(dice2)
			&& state1.getSouthNumber(dice1) == state2.getSouthNumber(dice2)
			&& state1.getEastNumber(dice1) == state2.getEastNumber(dice2)
			&& state1.getWestNumber(dice1) == state2.getWestNumber(dice2)
			&& state1.getNorthNumber(dice1) == state2.getNorthNumber(dice2)
			&& state1.getBottomNumber(dice1) == state2.getBottomNumber(dice2);
	}
}

public class Main {

	public void run(InputStream in, PrintStream out) {
        List<Dice> dices = parseInput(in);
        
        Set<DiceState> allStates = DiceState.allStates();
        
        long distincted = dices.stream().unordered().parallel()
        	.map(dice -> new DiceWithEquals(dice, allStates))
        	.distinct()
        	.count();
        
        if (dices.size() == distincted) {
        	out.println("Yes");
        } else {
        	out.println("No");
        }
    }

	private List<Dice> parseInput(InputStream in) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
        	int count = nextLineInt(reader, "?????????????????°");
        	List<Dice> dices = Stream.generate(() -> lineToDice(nextLine(reader, "??????????????¢?????°")))
        			.limit(count)
        			.collect(Collectors.toList());
	    	return dices;
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
    
    private int nextLineInt(BufferedReader reader, String label) {
    	String line = nextLine(reader, label);
    	try {
    		return Integer.parseInt(line);
    	} catch (Exception e) {
    		throw new IllegalArgumentException(label + "??????????????\????????°?????§??????????????????", e);
    	}
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