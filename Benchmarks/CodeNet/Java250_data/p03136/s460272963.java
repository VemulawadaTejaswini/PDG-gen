
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int [] n = new int [N];
		for(int i = 0;i < N;i++)    n[i] = sc.nextInt();
		int max = 0;
		int sum =0;

		for (int i=0;i<n.length;i++) {
			if(n[i]>max) {
				max=n[i];
			}
			sum += n[i];
		}
		if(max<(sum-max)) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}

	}
}
