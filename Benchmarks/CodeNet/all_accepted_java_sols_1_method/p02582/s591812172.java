import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        if (S.contains("RRR")) {
            ans = 3;
        } else if (S.contains("RR")) {
            ans = 2;
        } else if (S.contains("R")) {
            ans = 1;
        } 
        System.out.println(ans);
    }
}