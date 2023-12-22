import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ ) {
			String s = sc.next();
			int[] num = new int[8];
			for ( int j = 0; j < 8; j++ ) {
				num[j] = Integer.parseInt(s.charAt(j)+"");
			}
			Arrays.sort(num);
			int max = 0 , min = 0;
			for( int j = 7; j >= 0; j-- )
				max = max * 10 + num[j];
			for ( int j = 0; j < 8; j++ )
				min = min * 10 + num[j];
			System.out.println(max-min);
		}
	}
}