import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            ans.append('x');
        }
        System.out.println(ans.toString());
    }
}

