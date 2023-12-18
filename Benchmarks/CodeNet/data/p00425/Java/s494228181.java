import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{

	//static nbr.
	public static final int TOP		= 0;
	public static final int RIGHT	= 1;

	public static final String DEST_NORTH 	= "North";
	public static final String DEST_EAST	= "East";
	public static final String DEST_SOUTH	= "South";
	public static final String DEST_WEST 	= "West";
	public static final String DEST_RIGHT	= "Right";
	public static final String DEST_LEFT	= "Left";


	//dice
	public static int[] nowDice;


	public static void main(String[] args) throws NumberFormatException, IOException {

		//Set BufferedReader
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> alSumNbr = new ArrayList<Integer>();

		//Dice Default Set.
		nowDice = new int[2];
		nextDice(1, 3, "");

		int count = 0;

		while((count = Integer.parseInt(buffReader.readLine())) != 0) {
			int sum = 0;
			nextDice(1, 3, "");

			sum += nowDice[TOP];

			for(int i = 0; i < count; i++) {
				String destination = buffReader.readLine();

				//Set destination.
				nextDice(nowDice[TOP], nowDice[RIGHT], destination);

				sum += nowDice[TOP];
			}

			alSumNbr.add(sum);
		}

		for(Integer sum : alSumNbr) System.out.println(sum);

	}

	public static void nextDice(int nowTopDice, int nowRightDice, String destination) {
		switch(destination) {
			case DEST_NORTH:
				if(nowTopDice == 1) {
					if		(nowRightDice == 2) 	nowDice[TOP] 	= 4;
					else if	(nowRightDice == 3) 	nowDice[TOP] 	= 2;
					else if	(nowRightDice == 4) 	nowDice[TOP] 	= 5;
					else if	(nowRightDice == 5) 	nowDice[TOP] 	= 3;
				}else if(nowTopDice == 2) {
					if		(nowRightDice == 1) 	nowDice[TOP] 	= 3;
					else if	(nowRightDice == 3) 	nowDice[TOP] 	= 6;
					else if	(nowRightDice == 4) 	nowDice[TOP] 	= 1;
					else if	(nowRightDice == 6) 	nowDice[TOP] 	= 4;
				}else if(nowTopDice == 3) {
					if		(nowRightDice == 1) 	nowDice[TOP] 	= 5;
					else if	(nowRightDice == 2) 	nowDice[TOP] 	= 1;
					else if	(nowRightDice == 5) 	nowDice[TOP] 	= 6;
					else if	(nowRightDice == 6) 	nowDice[TOP] 	= 2;
				}else if(nowTopDice == 4) {
					if		(nowRightDice == 1) 	nowDice[TOP] 	= 2;
					else if	(nowRightDice == 2) 	nowDice[TOP] 	= 6;
					else if	(nowRightDice == 5) 	nowDice[TOP] 	= 1;
					else if	(nowRightDice == 6) 	nowDice[TOP] 	= 5;
				}else if(nowTopDice == 5) {
					if		(nowRightDice == 1) 	nowDice[TOP] 	= 4;
					else if	(nowRightDice == 3) 	nowDice[TOP] 	= 1;
					else if	(nowRightDice == 4) 	nowDice[TOP] 	= 6;
					else if	(nowRightDice == 6) 	nowDice[TOP] 	= 3;
				}else if(nowTopDice == 6) {
					if		(nowRightDice == 2) 	nowDice[TOP] 	= 3;
					else if	(nowRightDice == 3) 	nowDice[TOP] 	= 5;
					else if	(nowRightDice == 4) 	nowDice[TOP] 	= 2;
					else if	(nowRightDice == 5) 	nowDice[TOP] 	= 4;
				}
				break;
			case DEST_EAST:
				nowDice[RIGHT] 	= nowDice[TOP];
				nowDice[TOP] 	= 7 - nowRightDice;
				break;
			case DEST_SOUTH:
				if(nowTopDice == 1) {
					if		(nowRightDice == 2) 	nowDice[TOP] 	= 3;
					else if	(nowRightDice == 3) 	nowDice[TOP] 	= 5;
					else if	(nowRightDice == 4) 	nowDice[TOP] 	= 2;
					else if	(nowRightDice == 5) 	nowDice[TOP] 	= 4;
				}else if(nowTopDice == 2) {
					if		(nowRightDice == 1) 	nowDice[TOP] 	= 4;
					else if	(nowRightDice == 3) 	nowDice[TOP] 	= 1;
					else if	(nowRightDice == 4) 	nowDice[TOP] 	= 6;
					else if	(nowRightDice == 6) 	nowDice[TOP] 	= 3;
				}else if(nowTopDice == 3) {
					if		(nowRightDice == 1) 	nowDice[TOP] 	= 2;
					else if	(nowRightDice == 2) 	nowDice[TOP] 	= 6;
					else if	(nowRightDice == 5) 	nowDice[TOP] 	= 1;
					else if	(nowRightDice == 6) 	nowDice[TOP] 	= 5;
				}else if(nowTopDice == 4) {
					if		(nowRightDice == 1) 	nowDice[TOP] 	= 5;
					else if	(nowRightDice == 2) 	nowDice[TOP] 	= 1;
					else if	(nowRightDice == 5) 	nowDice[TOP] 	= 6;
					else if	(nowRightDice == 6) 	nowDice[TOP] 	= 2;
				}else if(nowTopDice == 5) {
					if		(nowRightDice == 1) 	nowDice[TOP] 	= 3;
					else if	(nowRightDice == 3) 	nowDice[TOP] 	= 6;
					else if	(nowRightDice == 4) 	nowDice[TOP] 	= 1;
					else if	(nowRightDice == 6) 	nowDice[TOP] 	= 4;
				}else if(nowTopDice == 6) {
					if		(nowRightDice == 2) 	nowDice[TOP] 	= 4;
					else if	(nowRightDice == 3) 	nowDice[TOP] 	= 2;
					else if	(nowRightDice == 4) 	nowDice[TOP] 	= 5;
					else if	(nowRightDice == 5) 	nowDice[TOP] 	= 3;
				}
				break;
			case DEST_WEST:
				nowDice[TOP] = nowDice[RIGHT];
				nowDice[RIGHT] = 7 - nowTopDice;
				break;
			case DEST_RIGHT:
				if(nowTopDice == 1) {
					if		(nowRightDice == 2) 	nowDice[RIGHT] 	= 3;
					else if	(nowRightDice == 3) 	nowDice[RIGHT] 	= 5;
					else if	(nowRightDice == 4) 	nowDice[RIGHT] 	= 2;
					else if	(nowRightDice == 5) 	nowDice[RIGHT] 	= 4;
				}else if(nowTopDice == 2) {
					if		(nowRightDice == 1) 	nowDice[RIGHT] 	= 4;
					else if	(nowRightDice == 3) 	nowDice[RIGHT] 	= 1;
					else if	(nowRightDice == 4) 	nowDice[RIGHT] 	= 6;
					else if	(nowRightDice == 6) 	nowDice[RIGHT] 	= 3;
				}else if(nowTopDice == 3) {
					if		(nowRightDice == 1) 	nowDice[RIGHT] 	= 2;
					else if	(nowRightDice == 2) 	nowDice[RIGHT] 	= 6;
					else if	(nowRightDice == 5) 	nowDice[RIGHT] 	= 1;
					else if	(nowRightDice == 6) 	nowDice[RIGHT] 	= 5;
				}else if(nowTopDice == 4) {
					if		(nowRightDice == 1) 	nowDice[RIGHT] 	= 5;
					else if	(nowRightDice == 2) 	nowDice[RIGHT] 	= 1;
					else if	(nowRightDice == 5) 	nowDice[RIGHT] 	= 6;
					else if	(nowRightDice == 6) 	nowDice[RIGHT] 	= 2;
				}else if(nowTopDice == 5) {
					if		(nowRightDice == 1) 	nowDice[RIGHT] 	= 3;
					else if	(nowRightDice == 3) 	nowDice[RIGHT] 	= 6;
					else if	(nowRightDice == 4) 	nowDice[RIGHT] 	= 1;
					else if	(nowRightDice == 6) 	nowDice[RIGHT] 	= 4;
				}else if(nowTopDice == 6) {
					if		(nowRightDice == 2) 	nowDice[RIGHT] 	= 4;
					else if	(nowRightDice == 3) 	nowDice[RIGHT] 	= 2;
					else if	(nowRightDice == 4) 	nowDice[RIGHT] 	= 5;
					else if	(nowRightDice == 5) 	nowDice[RIGHT] 	= 3;
				}
				break;
			case DEST_LEFT:
				if(nowTopDice == 1) {
					if		(nowRightDice == 2) 	nowDice[RIGHT] 	= 4;
					else if	(nowRightDice == 3) 	nowDice[RIGHT] 	= 2;
					else if	(nowRightDice == 4) 	nowDice[RIGHT] 	= 5;
					else if	(nowRightDice == 5) 	nowDice[RIGHT] 	= 3;
				}else if(nowTopDice == 2) {
					if		(nowRightDice == 1) 	nowDice[RIGHT] 	= 3;
					else if	(nowRightDice == 3) 	nowDice[RIGHT] 	= 6;
					else if	(nowRightDice == 4) 	nowDice[RIGHT] 	= 1;
					else if	(nowRightDice == 6) 	nowDice[RIGHT] 	= 4;
				}else if(nowTopDice == 3) {
					if		(nowRightDice == 1) 	nowDice[RIGHT] 	= 5;
					else if	(nowRightDice == 2) 	nowDice[RIGHT] 	= 1;
					else if	(nowRightDice == 5) 	nowDice[RIGHT] 	= 6;
					else if	(nowRightDice == 6) 	nowDice[RIGHT] 	= 2;
				}else if(nowTopDice == 4) {
					if		(nowRightDice == 1) 	nowDice[RIGHT] 	= 2;
					else if	(nowRightDice == 2) 	nowDice[RIGHT] 	= 6;
					else if	(nowRightDice == 5) 	nowDice[RIGHT] 	= 1;
					else if	(nowRightDice == 6) 	nowDice[RIGHT] 	= 5;
				}else if(nowTopDice == 5) {
					if		(nowRightDice == 1) 	nowDice[RIGHT] 	= 4;
					else if	(nowRightDice == 3) 	nowDice[RIGHT] 	= 1;
					else if	(nowRightDice == 4) 	nowDice[RIGHT] 	= 6;
					else if	(nowRightDice == 6) 	nowDice[RIGHT] 	= 3;
				}else if(nowTopDice == 6) {
					if		(nowRightDice == 2) 	nowDice[RIGHT] 	= 3;
					else if	(nowRightDice == 3) 	nowDice[RIGHT] 	= 5;
					else if	(nowRightDice == 4) 	nowDice[RIGHT] 	= 2;
					else if	(nowRightDice == 5) 	nowDice[RIGHT] 	= 4;
				}
				break;
			default:
				nowDice[TOP] 	= 1;
				nowDice[RIGHT]	= 3;
				break;
		}
	}







}
