import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        int input3 = scan.nextInt();

        int result = input2 / input1;
        if ( result <= input3 ) {
            System.out.println( (int)Math.floor(result) );
        }
        else {
            System.out.println( input3 );
        }
        scan.close();
    }
}