import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();long[] a = new long[n];
		for(int i=0;i<n;i++)a[i]=sc.nextLong()-(i+1);
		Arrays.sort(a);
		long median=0;
		switch (n % 2) {
		   case 0:
		     median=a[(n/2)-1];
		    break;
		   case 1:
		    median=a[n/2];
		    break;
		  }
		long sum=0;
		for(int i=0;i<n;i++) sum+=Math.abs(a[i]-median);
		System.out.println(sum);
	}
}
