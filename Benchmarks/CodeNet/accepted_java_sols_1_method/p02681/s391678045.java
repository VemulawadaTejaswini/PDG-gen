
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next(); 
        scan.close();

        if (str1.equals(str2.substring(0, str2.length()-1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        
    }
}
