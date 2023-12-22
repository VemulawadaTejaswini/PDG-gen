import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String[] s = S.split("");
        
        String ans = "No";
        for(int i=0; i<s.length; i++) {
            int idx = 0;
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<s.length; j++) {
                idx = i+j;
                if(i+j > s.length-1) {
                    idx = i+j-s.length;
                }
                sb.append(s[idx]);
            }
            if(String.valueOf(sb).equals(T)) {
                ans = "Yes";
                break;
            }
        }
        System.out.println(ans);
    }
    public static int min(int a, int b) {
        if(a <= b) return a;
        else return b;
    }
    public static int max(int a, int b) {
        if(a <= b) return b;
        else return a;
    }
}