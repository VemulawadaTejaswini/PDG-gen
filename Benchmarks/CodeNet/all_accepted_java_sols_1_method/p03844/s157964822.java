import java.util.Scanner;

public class Main{
    public static void main ( String[] args ) throws Exception {
        Scanner in = new Scanner( System.in );
        int a = in.nextInt();
        String op = in.next();
        int b = in.nextInt();
        switch ( op ){
            case "+":
                System.out.println( a + b );
                break;
            case "-":
                System.out.println( a - b );
                break;
        }
    }
}