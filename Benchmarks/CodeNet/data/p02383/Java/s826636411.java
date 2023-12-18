import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] input_num = new int[6];
		int dice_face_num = 6;
		String roll_str ="";

		Scanner sc= new Scanner( System.in );

		for ( int i = 0 ; i < dice_face_num ; i++ ) {
			input_num[i] = sc.nextInt();
		}

		roll_str = sc.next();

		Dice dice = new Dice(input_num);

		dice.init();

		for( int i = 0 ; i < roll_str.length(); i++ ) {
			dice.roll(roll_str.charAt(i));
//			System.out.println(roll_str.charAt(i) +":"+ dice.get_no());
		}
		System.out.println( dice.get_no() );
		sc.close();
	}

}

public class Dice {
	private int[] num;
	private int[] x_map = new int[4];
	private int[] y_map = new int[4];

	public Dice() {
		this( new int[]{1,2,3,4,5,6} );
	}

	public Dice(int input_num[]) {
		num = new int[6];
		num[0] = input_num[0];
		num[1] = input_num[1];
		num[2] = input_num[2];
		num[3] = input_num[3];
		num[4] = input_num[4];
		num[5] = input_num[5];
	}

	public void init() {
	//横軸
		x_map[0] = num[3];
		x_map[1] = num[0];
		x_map[2] = num[2];
		x_map[3] = num[5];
	//縦軸
		y_map[0] = num[4];
		y_map[1] = num[0];
		y_map[2] = num[1];
		y_map[3] = x_map[3];
	}

	public int get_no() {
		return x_map[1];
	}

	public void roll(char dc) {
		switch( dc ) {
		case 'N' :
			y_map[1] = y_map[2];
			y_map[2] = x_map[3];
			x_map[3] = y_map[0];
			y_map[0] = x_map[1];

			x_map[1] = y_map[1];
			break;
		case 'S' :
			y_map[1] = y_map[0];
			y_map[0] = x_map[3];
			x_map[3] = y_map[2];
			y_map[2] = x_map[1];

			x_map[1] = y_map[1];
			break;
		case 'E' :
			x_map[1] =  x_map[0];
			x_map[0] =  x_map[3];
			x_map[3] =  x_map[2];
			x_map[2] =  y_map[1];

			y_map[1] = x_map[1];
			break;
		case 'W' :
			x_map[1] =  x_map[2];
			x_map[2] =  x_map[3];
			x_map[3] =  x_map[0];
			x_map[0] =  y_map[1];

			y_map[1] = x_map[1];
			break;
		}
	}
}


