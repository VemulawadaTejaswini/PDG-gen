import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int res = Integer.MAX_VALUE;
        for(int i = 0; i <= s.length - t.length; i++){
            int idx = i;
            int count = 0;
            for(int j = 0; j < t.length;j++){
                if(s[idx++] != t[j])
                    count++;
            }
            res = Math.min(count, res);
        }
            System.out.println(res);
    }
}