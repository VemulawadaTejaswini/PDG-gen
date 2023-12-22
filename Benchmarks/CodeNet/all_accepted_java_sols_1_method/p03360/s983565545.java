import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] a = new int[3];
		
		
		for(int i = 0; i < 3; i++) {
			a[i] = stdIn.nextInt();
		}
		
		
		
		Arrays.parallelSort(a);
		int cnt  = a[0]+a[1];
		int k = stdIn.nextInt();
		for(int i = 0; i < k; i++) {
			a[a.length-1]*=2;
		}
		System.out.println(cnt+a[a.length-1]);
		
	}

}
