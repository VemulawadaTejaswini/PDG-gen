import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        String wet = in.next();
        String ans = "Yes";
        for (int i = 0; i <wet.length(); i++) {
            Character c = wet.charAt(i);
            if((i + 1) % 2 == 0) {
                if(c == 'R') {
                    ans = "No";
                    break;
                }
            } else {
                if(c == 'L') {
                    ans = "No";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
