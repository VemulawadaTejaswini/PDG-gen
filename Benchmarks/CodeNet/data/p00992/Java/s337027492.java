import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 1;
		int rap = 0;
		int[] a=new int[n];
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		sort(a);
		for(int i=0;i<n;i++) {
			sum += max(a[i]-rap, 0);
			if(i%4==3) rap++;
		}
		System.out.println(sum);
	}
}