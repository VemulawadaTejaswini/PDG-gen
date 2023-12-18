import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[] = new int[N];
		for (int i=0; i<N; i++) {
			d[i] = sc.nextInt(); 
		}
		Integer num[] = new Integer[101];
		Arrays.fill(num,  0);
		for (int i=0; i<N; i++) {
			num[d[i]]++; 
		}
		int count = 0;
		for (int i=0; i<=100; i++) {
			if (num[i]>0 ) count++;
		}
		System.out.println(count);
	}
}
