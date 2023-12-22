import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // Input
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String result = "Good";

        for ( int i = 0; i < str.length()-1; i++ ) {
           int j = i + 1;
           if ( str.substring(i, i+1).equals(str.substring(j, j+1)) ) {
              result = "Bad";
              break;
           }
        }

        // Output
        System.out.println(result);

        sc.close();
    }
}
