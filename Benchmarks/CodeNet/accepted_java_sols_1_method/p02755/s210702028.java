import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt( params[1]);

        int minB = b * 10;
        int maxB = b * 10 + 9;

        for( int i = minB ; i < maxB ; i++ ){
            int ans = (int)(i * 0.08);
            if( ans == a ){
                System.out.println( i );
                return;
            }
        }

        System.out.println( -1 );
    }

}
