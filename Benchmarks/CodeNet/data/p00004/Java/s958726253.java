import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while( scan.hasNextInt() ) {
			Integer[] ary = new Integer[6];
			
			for(int i = 0; i < 6; i++) {
				ary[i] = scan.nextInt();
			}
			
			double x = (double)1 / (double)((ary[0]*ary[4])-(ary[1]*ary[3])) * (double)((ary[4]*ary[2])-(ary[1]*ary[5]));
			double y = (double)1 / (double)((ary[0]*ary[4])-(ary[1]*ary[3])) * (double)((-(ary[2]*ary[3])+(ary[0]*ary[5])));
			
			if(Math.abs(x) < 0.005) {
				x = 0;
			}
			if(Math.abs(y) < 0.005) {
				y = 0;
			}
			
			System.out.printf("%.3f %.3f\n", x, y);
			
		}
	}
}