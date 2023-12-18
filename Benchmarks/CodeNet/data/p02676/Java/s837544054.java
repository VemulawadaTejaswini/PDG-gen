import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        String S = sc.next();

        if (S.length() <= K) {
            System.out.println(S);
        } else {
            String reshapedS = S.substring(0, K) + "...";
            System.out.println(reshapedS);
        }
        
    }
}