import java.util.Scanner;

public class Main {
	
	void main() {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt ();
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt ();
		}
		for(int i = 0; i < a.length; i++) {
		System.out.print(a[n-1-i]);
		if (i != (a.length - 1))
		System.out.print(" ");
		
		}
		System.out.println();
	}
	public static void main(String[] args) {
		  new Main().main();
	}
	
	}
