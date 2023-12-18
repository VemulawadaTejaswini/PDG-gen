import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int tmp = 0;
        for(int i=N.length()-1; i>=0; i--) {
            int t = (N.charAt(i) - '0');
            tmp+=t;
        }
        System.out.println(tmp % 9 == 0 ? "Yes" : "No");
    }
}
