import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(), k = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) array[i]=sc.nextInt();
		Arrays.sort(array);
		for(int i=n-1;i>=n-k;i--) {
			if(i>=0) array[i]=0;
			else break;
		}
		long sum=0;
		for(int i=0;i<n;i++) sum+=array[i];
		System.out.println(sum);
	}
}