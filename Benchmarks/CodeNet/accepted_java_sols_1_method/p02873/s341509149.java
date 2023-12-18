import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long res = 0;
        for (int i = 0; i < S.length();) {
            long a = 0;
            long b = 0;
            while (i < S.length() && S.charAt(i) == '<') {
                a++;
                i++;
            }
            while (i < S.length() && S.charAt(i) == '>') {
                b++;
                i++;
            }
            res += a*(a-1)/2 + b*(b-1)/2 + Math.max(a, b);
        }
        System.out.println(res);
    }
    
}
