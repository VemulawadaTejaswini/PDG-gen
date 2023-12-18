
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	//public static int[][] table = new int[15][15000];
	public static int[] memo = new int[10];
	public static int s;
	public static int ss = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
		//System.out.println(getNth(543, 1));
	}
	
	public static void doIt(){



		int n;

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			s = sc.nextInt();
			ss = 0;
			Arrays.fill(memo, 0);
			numnum (n, 1, 0 );
			System.out.println(ss);
		}
	}
	
	public static void numnum(int size, int depth, int sum )
	{
		if (size + 1 == depth ) {
			//table[size][sum]++;
			if(sum == s){
				ss++;
			}
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