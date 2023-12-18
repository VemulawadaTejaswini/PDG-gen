import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++){
			a[i] = scanner.nextInt();
		}
		
		Arrays.sort(a);
		
		for (int i = 0; i < n; i++){
			if (i != 0) System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println("");
	}
}