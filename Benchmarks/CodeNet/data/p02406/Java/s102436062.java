import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num = 0;

        Scanner sc= new Scanner(System.in);

        num = sc.nextInt();
        for( int i = 1 ; i <= num ; i++) {
        	if( ( i % 3 == 0 ) || (i % 10 == 3 )) {
        		System.out.print( " " + i );
        	}
        }
		System.out.print( " \n" );
        sc.close();
    }
}

