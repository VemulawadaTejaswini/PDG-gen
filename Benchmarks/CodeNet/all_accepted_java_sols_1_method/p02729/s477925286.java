import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int[] a=new int[n+1];
		int[] b= new int[m];
		
		System.out.println((n*(n-1)/2)+(m*(m-1)/2));


	}

}
