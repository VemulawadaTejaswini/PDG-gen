import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int n = stdIn.nextInt();
//		int n = 100000;
		int a[] = new int [n];
		
		for(int i=0;i<n;i++)
//			a[i] = rand.nextInt(1000);
			a[i] = stdIn.nextInt();

		Arrays.sort(a);

		for(int i=0;i<n-1;i++)
			System.out.print(a[i]+" ");
		System.out.println(a[n-1]);
	}
}