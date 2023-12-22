import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		long sum = 0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		for(int i=0;i<n/2;i++) {
			sum = sum - a[i*2+1]*2;
		}
		int sum2 = (int)sum;
		int tmp = (int)sum;
		for(int i=0;i<n;i++) {
			System.out.print(sum2 + " ");
			sum2 = a[i]*2 - tmp;
			tmp = sum2;
		}
	}
}