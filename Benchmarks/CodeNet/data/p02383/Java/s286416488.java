import java.util.Scanner;

public class Main {

	public static int[][] dice_bottom_update( int[][] map, int num) {
		map[0][2] = num;
		map[2][0] = num;
		map[2][4] = num;
		map[4][2] = num;
		return map;
	}

	public static int[][] map_roll_n( int[][] map ) {
		for ( int i = 0 ; i < 4 ; i++ ) {
			map[2][i] = map[2][i+1];
		}
		map = dice_bottom_update( map, map[2][0] );
		return map;
	}

	public static int[][] map_roll_s( int[][] map ) {
		for ( int i = 4 ; i > 0 ; i-- ) {
			map[2][i] = map[2][i-1];
		}
		map = dice_bottom_update( map, map[2][4] );
		return map;
	}

	public static int[][] map_roll_w( int[][] map ) {
		for ( int i = 0 ; i < 4 ; i++ ) {
			map[i][2] = map[i+1][2];
		}
		map = dice_bottom_update( map, map[0][2] );
		return map;
	}

	public static int[][] map_roll_e( int[][] map ) {
		for ( int i = 4 ; i > 0 ; i-- ) {
			map[i][2] = map[i-1][2];
		}
		map = dice_bottom_update( map, map[4][2] );
		return map;
	}

	static class Dice {
		private int[] num;
		private int[][] dice_map = new int[5][5];

		/* *** dice_map
           0   1   2   3   4 x
        0  -   -  [6]  -   -
        1  -   -  [5]  -   -
        2 [6] [4] [1] [3] [6]
        3  -   -  [2]  -   -
        4  -   -  [6]  -   -
        y

        top : dice_map[2][2]
        bottom : dice_map[0][2] = dice_map[2][0] = dice_map[2][4] = dice_map[4][2]
		*** */

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
			//1(top)
			dice_map[2][2] = num[0];
			//2
			dice_map[2][3] = num[1];
			//3
			dice_map[3][2] = num[2];
			//4
			dice_map[1][2] = num[3];
			//5
			dice_map[2][1] = num[4];
			//6(bottom)
			dice_map = dice_bottom_update( dice_map, num[5] );
		}

		public int get_no() {
			return dice_map[2][2];
		}

		public void roll(char dc) {
			switch( dc ) {
			case 'N' :
				dice_map = map_roll_n( dice_map );
				break;
			case 'S' :
				dice_map = map_roll_s( dice_map );
				break;
			case 'E' :
				dice_map = map_roll_e( dice_map );
				break;
			case 'W' :
				dice_map = map_roll_w( dice_map );
				break;
			}
		}
	}


	public static void main(String[] args) {

		int dice_face_num = 6;
		int[] input_num = new int[dice_face_num];
		String roll_str ="";

		Scanner sc= new Scanner( System.in );

		for ( int i = 0 ; i < dice_face_num ; i++ ) {
			input_num[i] = sc.nextInt();
		}

		roll_str = sc.next();

		Dice dice = new Main.Dice(input_num);

		dice.init();

		for( int i = 0 ; i < roll_str.length(); i++ ) {
			dice.roll(roll_str.charAt(i));
		}
		System.out.println( dice.get_no() );
		sc.close();
	}
}
