
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static int[][] table = new int[10+1][10000];
	public static int[] memo = new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
		//System.out.println(getNth(543, 1));
	}
	
	public static void doIt(){

		for (int i = 1; i <= 10; ++i ) {
			Arrays.fill(memo, 0);
			numnum (i, 1, 0 );
		} // end for

		int n, s;

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			s = sc.nextInt();
			//setNth(0);
			System.out.println(table[n][s]);
		}
	}
	
	public static void numnum(int size, int depth, int sum )
	{
		if (size + 1 == depth ) {
			table[size][sum]++;
		}else{
			for (int i = 0; i <= 9; ++i ){
				if ( memo[i] == 0 ) {
					memo[i] = 1;
					numnum (size, depth + 1, sum + i*depth );
					memo[i] = 0;
				} // end if
			} // end for
		} // end if
	}
}