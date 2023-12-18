import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Dice {
	private String[] numbers;
	
	public Dice(String[] numbers) {
		this.numbers = numbers;
	}

	public String getNumber(int index) {
		return numbers[index];
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
	
	public DiceState runCommand(char command) {
		switch (command) {
			case 'N':
				return new DiceState(south, bottom, east, west, top, north);
			case 'S':
				return new DiceState(north, top, east, west, bottom, south);
			case 'E':
				return new DiceState(west, south, top, bottom, north, east);
			case 'W':
				return new DiceState(east, south, bottom, top, north, west);
			default:
				throw new IllegalStateException("?????????????????????????????§???: " + command);
		}
	}

	public int getTopIndex() {
		return top;
	}
}

public class Main {

	public void run(InputStream in, PrintStream out) {
        Input input = parseInput(in);
        DiceState state = new DiceState();
        for (char command : input.commands.toCharArray()) {
        	state = state.runCommand(command);
        }
        String number = input.dice.getNumber(state.getTopIndex());
        out.println(number);
    }

    private Input parseInput(InputStream in) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
	    	Dice dice = lineToDice(nextLine(reader, "??????????????¢?????°"));
	    	String commands = nextLine(reader, "??????");
	    	return new Input(dice, commands);
        } catch (IOException e) {
    		throw new IllegalArgumentException("??\???????????????????????±???????????????", e);
        }
    }
    
   	private Dice lineToDice(String line) {
		String[] numbers = line.split(" ");
		if (numbers.length != 6) {
    		throw new IllegalArgumentException("??????????????¢?????°????????£??§???: " + line);
		}

        return new Dice(numbers);
	}

	private static class Input {
		Dice dice;
		String commands;
		
		public Input(Dice dice, String commands) {
			this.dice = dice;
			this.commands = commands;
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