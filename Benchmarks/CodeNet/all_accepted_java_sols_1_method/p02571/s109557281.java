import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String S = sc.next();
 
        int res = (int)1e9;
        int legth = (T.length() - S.length()) + 1;
        for (int index = 0; index < legth; index++) {
            int count = 0;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) != T.charAt(index + j)) {
                    count++;
                }
            }
            if(count < res) {
                res = count;
            }
        }
        System.out.println(res);
    }
}