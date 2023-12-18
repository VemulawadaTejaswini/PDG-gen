import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // Input
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String result = "";

        if ( input.trim().equals("Sunny") ) {
           result="Cloudy";
        } else if ( input.trim().equals("Cloudy") ) {
           result="Rainy";
        } else if ( input.trim().equals("Rainy") ) {
           result="Sunny";
        } else {
           result="Input Error";
        }

        // Output
        System.out.println(result);

        sc.close();
    }
}