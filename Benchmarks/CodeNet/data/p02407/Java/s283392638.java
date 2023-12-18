import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner sc= new Scanner(System.in);
    	int num = 0;

    	num = sc.nextInt();

    	int[] a = new int[num];

    	for ( int i = 0 ; i < num ; i++ ) {
    		a[i] = sc.nextInt();
    	}

    	for ( int i = num-1 ; i >= 0 ; i-- ) {
    		System.out.print( a[i] + " ");
    	}
    	
    	sc.close();
    }
}
