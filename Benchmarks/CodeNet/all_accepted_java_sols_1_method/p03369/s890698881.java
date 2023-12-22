import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;

        if (s.substring(0, 1).equals("o")) {
            cnt++;
        }
        if (s.substring(1, 2).equals("o")) {
            cnt++;
        }
        if (s.substring(2, 3).equals("o")) {
            cnt++;
        }

        System.out.println((700 + cnt * 100));
        sc.close();
    }    
}
