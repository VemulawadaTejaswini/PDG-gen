import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = sc.nextInt();
		for (int i=n-1; i>=0; i--) System.out.print((i!=n-1?" ":"")+ar[i]);
		System.out.println();
		
	}
}
