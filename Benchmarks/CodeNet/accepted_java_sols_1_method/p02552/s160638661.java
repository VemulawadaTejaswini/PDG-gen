import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if( x==1 ) {
			System.out.println( "0" );
		}
		else if(x==0){
			System.out.println( "1" );
		}
		else {
			System.out.println( "ng" );
		}				
		sc.close();
	}
}