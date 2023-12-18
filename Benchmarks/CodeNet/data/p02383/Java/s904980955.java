import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] data = new int[Dice.SURFACE];

		for(int i = 0; i < data.length; i++){
			data[i] = Integer.parseInt(input[i]);
		}

		Dice dice = new Dice(data);
		char[] ope = br.readLine().toCharArray();

		for(int i = 0; i < ope.length; i++){

			switch(ope[i]){
				case 'N':
					dice.moveN();
					break;
				case 'E':
					dice.moveE();
					break;
				case 'W':
					dice.moveW();
					break;
				case 'S':
					dice.moveS();
					break;
			}

		}

		System.out.println(dice.getNum(Dice.TOP));


	}
}

class Dice{

	static final int SURFACE = 6;
	static final int TOP = 0;
	static final int FRONT = 1;
	static final int RIGHT = 2;
	static final int LEFT = 3;
	static final int BACK = 4;
	static final int BOTTOM = 5;
	int[][] dice = new int[SURFACE][2];

	public Dice(){

		for(int i = 0; i < SURFACE; i++){
			dice[i][0] = i + 1;
			dice[i][1] = dice[i][0];
		}

	}

	public Dice(int[] data){

		this();

		for(int i = 0; i < SURFACE; i++){
			dice[i][1] = data[i];
		}

	}

	public void moveN(){

		int[] temp = dice[TOP];
		dice[TOP] = dice[FRONT];
		dice[FRONT] = dice[BOTTOM];
		dice[BOTTOM] = dice[BACK];
		dice[BACK] = temp;

	}

	public void moveE(){

		int[] temp = dice[TOP];
		dice[TOP] = dice[RIGHT];
		dice[RIGHT] = dice[BOTTOM];
		dice[BOTTOM] = dice[LEFT];
		dice[LEFT] = temp;

	}

	public void moveW(){

		int[] temp = dice[TOP];
		dice[TOP] = dice[LEFT];
		dice[LEFT] = dice[BOTTOM];
		dice[BOTTOM] = dice[RIGHT];
		dice[RIGHT] = temp;

	}

	public void moveS(){

		int[] temp = dice[TOP];
		dice[TOP] = dice[BACK];
		dice[BACK] = dice[BOTTOM];
		dice[BOTTOM] = dice[FRONT];
		dice[FRONT] = temp;

	}

	public void turnR(){

		int[] temp = dice[FRONT];
		dice[FRONT] = dice[RIGHT];
		dice[RIGHT] = dice[BACK];
		dice[BACK] = dice[LEFT];
		dice[LEFT] = temp;

	}

	public void turnL(){

		int[] temp = dice[FRONT];
		dice[FRONT] = dice[LEFT];
		dice[LEFT] = dice[BACK];
		dice[BACK] = dice[RIGHT];
		dice[RIGHT] = temp;

	}

	public int getNum(int position){

		return dice[position][1];

	}
}