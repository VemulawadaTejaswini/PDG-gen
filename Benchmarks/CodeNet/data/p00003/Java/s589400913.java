import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		int n = sc.nextInt();
		
		for (int x = 0 ; x <= n ; x++){
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int [] array = new int [] {a,b,c};
			Arrays.sort(array);
			
			if((array[0])*(array[0])
					+(array[1])*(array[1])
				== (array[2])*(array[2])){
				System.out.println( "YES" );
				}else{
					System.out.println( "NO" );
				}
			
		}
	}

}