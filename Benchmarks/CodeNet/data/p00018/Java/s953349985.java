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
		
		for ( int i = 0; i < array.length; i++){
			
			System.out.println(array[i]);
		}
	
	}

}