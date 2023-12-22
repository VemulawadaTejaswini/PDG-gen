import java.util.Scanner;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String input = scan.nextLine();
                int len = input.length();
                int sum1 = 0;
                int sum0 = 0;
                int result = 0;

                for (int i=0; i<len; i++) {
                        if ( input.charAt(i) == '1' ) {
                                sum1++;
                        }
                        else {
                                sum0++;
                        }
                }
                if ( sum0 <= sum1 ) {
                        result = sum0 * 2;
                }
                else {
                        result = sum1 * 2;
                }
                System.out.println( result );
                scan.close();
        }
}
