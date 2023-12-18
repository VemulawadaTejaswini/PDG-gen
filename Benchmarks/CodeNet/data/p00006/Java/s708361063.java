import java.util.Scanner;

public class Main {
	
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		String str = sc.next();
		
		String[] array = str.split("");
		
		int n = array.length;
		
		for ( int x = n - 1 ; x >= 0 ; x--){
		System.out.print(array[x]);
		}

	}

}