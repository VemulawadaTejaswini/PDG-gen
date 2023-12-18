import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int num = 0;
        int min = 1000000;
        int max = -1000000;
        int sum = 0;

        num = sc.nextInt();

        int[] a = new int[num];

        for( int i = 0 ; i < num ; i++ ) {
            a[i] = sc.nextInt();

        	if ( a[i] <= min ) {
        		min = a[i];
        	}
        	if ( a[i] >= max ) {
        		max = a[i];
        	}
        	sum += a[i];
        }
        System.out.println( min + " " + max + " " + sum );
        sc.close();
    }
}

