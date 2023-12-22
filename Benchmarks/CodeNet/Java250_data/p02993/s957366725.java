import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();

        boolean isOK = true;
        for (int i = 0; i < 3; i++) {
            char c0 = s.charAt(i);
            char c1 = s.charAt(i+1);
            if (c0 == c1) {
                isOK = false;
                break;
            }
        }
        if (isOK) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
   	}
}
