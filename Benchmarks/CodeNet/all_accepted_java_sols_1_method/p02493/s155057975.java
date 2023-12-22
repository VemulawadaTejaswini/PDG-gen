import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] a = new int[n];
		for( int i = 0; i < n; i++ ){
			a[i] = Integer.parseInt(scan.next());
		}
		for( int i = n - 1; i > 0; i-- ){
			System.out.print(a[i] + " ");
		}
		System.out.println(a[0]);
		return;
	}
}