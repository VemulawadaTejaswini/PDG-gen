import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int a[]= new int[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.parallelSort(a);
		int count =0;
		for (int i=0;i<N;i++) {
			if (x>=a[i]) {
				count++;
				x-=a[i];
			}
		}
		if (x>0&&count==N) {
			count --;
		}
		System.out.println(count);
	}
}