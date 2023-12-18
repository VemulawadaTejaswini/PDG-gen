import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] inputs = scan.nextLine().split(" ");
	int[] face = new int[6];
	int SOUTH = 2;
	int NORTH = 5;
	int WEST = 4;
	int EAST = 3;
	int TOP = 1;
	int BOTTOM = 6;
	for (int i = 0; i < 6; i++) {
	    face[i] = Integer.parseInt(inputs[i]);
	}
	String commands = scan.nextLine();
	for (int i = 0; i < commands.length(); i++) {
	    String command = commands.substring(i, i+1);
	    if (command.equals("S")) {
		BOTTOM = SOUTH;
		SOUTH = TOP;
		NORTH = 7 - SOUTH;
		TOP = 7 - BOTTOM;
	    } else if (command.equals("N")) {
	        BOTTOM = NORTH;
		NORTH = TOP;
		SOUTH = 7 - NORTH;
		TOP = 7 - BOTTOM;
	    } else if (command.equals("W")) {
		BOTTOM = WEST;
		WEST = TOP;
		EAST = 7 - WEST;
		TOP = 7 - BOTTOM;
	    } else if (command.equals("E")) {
		BOTTOM = EAST;
		TOP = WEST;
		WEST = 7 - EAST;
	        TOP = 7 - BOTTOM;
	    }
	}
	System.out.println(face[TOP-1]);
    }
    
}