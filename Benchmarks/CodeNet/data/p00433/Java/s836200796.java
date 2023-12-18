import java.util.Scanner;
public class Main {

	static int Comparison(int a, int b) {
		return(((a > b) ? a : b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int[] sum = new int[2];
		
		for(int r = 0; r < 2; r++) {
			int buf;
			sum[r] = 0;
			for(int c = 0; c < 4; c++) {
				buf = stdIn.nextInt();
				sum[r] += buf;
			}
		}
		
		System.out.println(Comparison(sum[0], sum[1]));
	}
}