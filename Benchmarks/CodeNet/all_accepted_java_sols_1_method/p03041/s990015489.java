import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt()-1;
        String S = sc.next();
        System.out.println(S.substring(0,K) + S.substring(K,K+1).toLowerCase() + S.substring(K+1, S.length()));

    }
}
