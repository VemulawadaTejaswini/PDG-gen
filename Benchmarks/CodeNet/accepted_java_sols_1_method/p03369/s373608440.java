import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int price = 700;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == 'o') {
                price += 100;
            }
        }
        System.out.println(price);
    }
}

