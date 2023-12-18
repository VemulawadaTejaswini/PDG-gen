import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = input.nextInt();
			long[] arr = new long[N];
			long x = 0;
			for (int j = 0 ; j < N; j++) {
				arr[j] = input.nextLong();
			}
			String S = input.next();
			for (int turn = 0; turn < N; turn++) {
				if (!(S.charAt(turn)=='0'&&x==0)) {
					if (x!=arr[turn]&&S.charAt(turn)=='1') x^=arr[turn];
					else if (x==arr[turn]&&S.charAt(turn)=='0') x^=arr[turn];
				}
			}
			System.out.println(x==0?"0":"1");
		}
	}
}