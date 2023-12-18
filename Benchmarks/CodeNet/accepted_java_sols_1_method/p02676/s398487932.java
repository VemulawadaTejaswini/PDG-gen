import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.next();
        String tmp;
        if(S.length() > K) {
            tmp = S.substring(0,K);
            tmp = tmp + "...";
        } else {
            tmp = S;
        }
        System.out.println(tmp);
    }
}