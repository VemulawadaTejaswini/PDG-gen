import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
        stdIn.close();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}