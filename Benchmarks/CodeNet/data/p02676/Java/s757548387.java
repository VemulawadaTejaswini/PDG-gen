import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.nextLine();
        String tmp;
        if(S.length > K) {
            tmp = S.substring(K);
            tmp + "...";
        } else {
            tmp = S;
        }
        System.out.println(tmp);
    }
}