import java.util.Scanner;

public class Main {
	
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		String str = sc.next();
		
		String[] array = str.split("");
		
		int n = array.length;
		
		String str2 = "" ;
		String str3 = "" ;
		
		for ( int x = n - 1 ; x >= 0 ; x--){
			
			str3 = array[x] ;
			str2 = str2 + str3 ;
		}
		System.out.print( str2 ) ;

	}

}