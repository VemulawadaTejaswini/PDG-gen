import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = Long.parseLong(sc.next());
        String[] sp = S.split("");
        int[] s = new int[sp.length];
        for(int i=0; i<sp.length; i++) {
            s[i] = Integer.parseInt(sp[i]);
        }
        int ans = 1;
        for(int i=0; i<K; i++) {
            if(s[i] == 1) {
            }else {
                ans = s[i];
                break;
            }
        }
        System.out.println(ans);
    }
}