import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];			
		for(int i = 0;i<N;i++) {
			 a[i] = sc.nextInt();			
		}
		Arrays.sort(a);
		int sum =0;
		sum = a[a.length/2]-a[a.length/2-1];
		System.out.print(sum);
	}
}
