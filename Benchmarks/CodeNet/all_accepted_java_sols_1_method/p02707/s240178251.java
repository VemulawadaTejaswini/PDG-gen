import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n =sc.nextLong();
		int[] a = new int[(int) n];
		
		for(int i=1;i<n;i++) {
			a[sc.nextInt()-1]++;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
}
