import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		int i = N-1;
		int alice =0;
		int bob =0;
		boolean flag = true;
		while(i>=0) {
			if(flag) {
				alice+=a[i];
				flag = false;
			}else {
				bob += a[i];
				flag = true;
			}
			i--;

		}
	System.out.println(alice-bob);
	}
}
