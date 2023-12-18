import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char pre = s.charAt(0);
        String ans = "Good";
        for (int i = 1; i < 4; i++) {
            if(pre == s.charAt(i)) ans = "Bad";
            pre = s.charAt(i);
        }
        System.out.println(ans);
        sc.close();

    }

}
