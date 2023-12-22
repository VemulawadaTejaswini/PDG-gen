import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i=0;i<n;i++) {
			d[i]=sc.nextInt();
		}
		Arrays.parallelSort(d);
		int abc=d[n/2-1];
		int agc=d[n/2];
		int count=0;
		for(int i=abc+1;i<=agc;i++) {
			count++;
		}
		System.out.println(count);
	}
}
