import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p[] = new int[N];
		int temp[] = new int[N];
		for (int i=0;i<N;i++) {
			temp[i] = sc.nextInt();
			p[i] = temp[i];
		}
		Arrays.parallelSort(p);
		int count =0;
		for (int i=0;i<N;i++) {
			if (temp[i]!=p[i]) {
				count ++;
			}
		}
		if (count<=2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
