//  PDF 解法2.横に切って、その後縦に切る
import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        String S = sc.next();
        String ans = "";

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if ((int)c+N > 90) {
                int x = (int)c - 26 + N;
                ans += (char)x;
            } else {
                int x = (int)c + N;
                ans += (char)x;
            }
        }
        System.out.println(ans);
    }  
}