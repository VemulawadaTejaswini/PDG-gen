import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int topping = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'o') topping += 100;
        }
        
        System.out.println(700 + topping);
    }
}
