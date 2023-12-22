import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] l = new long[n+1];
        if(n == 1) {
            System.out.println(1);
        }else {
            l[0] = 2;
            l[1] = 1;
            for(int i=2; i<=n; i++) {
                l[i] = l[i-1] + l[i-2];
                if(i == n) {
                    System.out.println(l[i]);
                    break;
                }
            }
        }
    }
}