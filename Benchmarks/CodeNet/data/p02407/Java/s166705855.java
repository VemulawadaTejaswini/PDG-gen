import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		scan.nextLine();
		
		for (int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=n-1; i>=0; i--) {
			System.out.print(arr[i]);
			if(i!=0) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}






