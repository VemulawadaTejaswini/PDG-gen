import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		
		for (int i = 0; i < 3; i++){
			a[i] = scanner.nextInt();
		}
		
		Arrays.sort(a);
		
		for (int i = 0; i < 3; i++){
			if (i != 0) System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println("");
	}
}