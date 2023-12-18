
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            String s = scanner.next();
            String s2 = s + s;
            String p = scanner.next();
            if (s2.contains(p)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
           /* for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)==p.charAt(i)){

                }
            }*/

        } catch (Exception e) {

        } finally {

        }

    }

}


