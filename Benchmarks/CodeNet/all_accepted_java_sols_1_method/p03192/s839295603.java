import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (n.charAt(i) == '2') {
                count++;
            }
        }
        System.out.println(count);
    }
}
