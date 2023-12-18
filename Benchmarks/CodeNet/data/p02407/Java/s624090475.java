import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}

		for(int i=0;i<a.length;i++){
			b[a.length-(i+1)] = a[i];
		}
		
		for(int i=0; i<n-1;i++){
			System.out.print(b[i]+" ");
		}

		System.out.println(b[n-1]);
	}

}