import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();
        String c = null;
        long sum = 0;
        for (int i=0; i < n.length(); i++) {
            c = n.substring(i, i + 1);
            sum += Long.parseLong(c);

        }
        if (sum % 9 == 0 || sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}