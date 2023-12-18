import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
				
		int [] array = new int [] {a,b,c,d,e};
		Arrays.sort(array);
		
		for ( int i = 4; i >= 1 ; i--){
			System.out.print(array[i] + " ");
		}
		System.out.print(array[0]);
		
	}

}