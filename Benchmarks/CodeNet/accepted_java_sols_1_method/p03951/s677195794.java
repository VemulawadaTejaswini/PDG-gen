import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        int ret = n*2;
        for (int i = 0;i < n;i++) {
            String tmp1 = s1.substring(i, n);
            String tmp2 = s2.substring(0, n-i);
            if (tmp1.equals(tmp2)) {
                ret = n+i;
                break;
            }
        }
        
        System.out.println(ret);
    }
}
