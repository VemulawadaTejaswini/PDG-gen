import java.util.Scanner;

public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int a[] = new int[n]; 
		
		for(int i= 0; i < n -1 ; i++) {
			int temp = scan.nextInt()-1;
			a[temp]++;
		}
		
		for(int i= 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}