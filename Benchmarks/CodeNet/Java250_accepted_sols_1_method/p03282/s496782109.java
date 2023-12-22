import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        int idx = 0;
        while(idx < k-1) {
            if(s.charAt(idx) != '1')
                break;
            idx++;
        }
        System.out.println(s.charAt(idx));
    }
}
