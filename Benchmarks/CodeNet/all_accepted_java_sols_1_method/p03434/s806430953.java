import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		int A=0;
		int B=0;
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			b[i] = a[n - i - 1];
		}
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				A += b[i];
			} else {
				B += b[i];
			}
		}
		System.out.println(A - B);

	}

}
