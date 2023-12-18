import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	Dice[] dices = new Dice[n];
	for (int i = 0 ; i < n; i++) {
	    String[] input = scan.nextLine().split(" ");
	    int[] face = new int[6];
	    for (int j = 0; j < 6; j++) {
		face[j] = Integer.parseInt(input[j]);
	    }
	    dices[i] = new Dice(face);
	}
	boolean flag = true;
	for (int i = 0; i < dices.length; i++) {
	    for (int j = i+1; j < dices.length; j++) {
		if (dices[i].checkSameDice(dices[j])) {
		    flag = false; 
		}
	    }
	}

	if (flag) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}
class Dice{
    int NORTH = 4;
    int SOUTH = 1;
    int WEST = 3;
    int EAST = 2;
    int TOP = 0;
    int BOTTOM = 5;
    int[] face = new int[6];
	
    Dice(int[] face){
	this.face = face;
    }

    void setFront(int front){
	while(face[SOUTH] != front){
	    turnRight();
	}
    }
    
    void setTop(int top, int bottom){
	int cnt = 0;
	while((face[TOP] != top || face[BOTTOM] != bottom) && cnt < 4){
	    turnSouth();
	    cnt++;
	}
	cnt = 0;
	while((face[TOP] != top || face[BOTTOM] != bottom) && cnt < 4){
	    turnEast();
	    cnt++;
	}
    }

    void turnRight(){
	turnEast();
	turnSouth();
	turnWest();
    }

    void turnEast(){
	int bottom = face[BOTTOM];
	int west = face[WEST];
	face[BOTTOM] = face[EAST];
	face[EAST] = face[TOP];
	face[WEST] = bottom;
	face[TOP] = west;
    }

    void turnWest(){
	int bottom = face[BOTTOM];
	int east = face[EAST];
	face[BOTTOM] = face[WEST];
	face[WEST] = face[TOP];
	face[EAST] = bottom;
	face[TOP] = east;
    }
	
    void turnNorth(){
	int bottom = face[BOTTOM];
	int south = face[SOUTH];
	face[BOTTOM] = face[NORTH];
	face[NORTH] = face[TOP];
	face[SOUTH] = bottom;
	face[TOP] = south;
    }

    void turnSouth(){
	int bottom = face[BOTTOM];
	int north = face[NORTH];
	face[BOTTOM] = face[SOUTH];
	face[SOUTH] = face[TOP];
	face[NORTH] = bottom;
	face[TOP] = north;
    }
    
    int getFace(int index){
	return face[index];
    }

    int getFront(){
	return face[SOUTH];
    }
    
    int getTop() {
	return getFace(TOP);
    }

    boolean checkSameDice(Dice dice2){
	int top1 = getTop();
	int bottom1 = getFace(BOTTOM);
	dice2.setTop(top1, bottom1);
	int[] side1 = new int[8];
	int[] side2 = new int[4];
	for (int i = 0; i < 4; i++) {
	    side1[i] = getFront();
	    side1[i+4]  = getFront();
	    side2[i] = dice2.getFront();
	    turnRight();
	    dice2.turnRight();
	}
	if (face[TOP] != dice2.getFace(TOP) || face[BOTTOM] != dice2.getFace(BOTTOM)) {
	    return false;
	}
	for (int i = 0; i < 4; i++) {
	    if (side1[0+i] == side2[0] && side1[1+i] == side2[1] && side1[2+i] == side2[2] && side1[3+i] == side2[3]) {
		return true;
	    }
	}
	return false;
    }
}
    