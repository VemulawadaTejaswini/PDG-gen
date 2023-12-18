import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        int n = s.length;
        int m = t.length;

        int min = m;
        for(int i=0; i+m-1<n; i++) {
            int a = 0;
            for(int j=0; j<m; j++) {
                if(s[i+j] != t[j]) {
                    a++;
                }
            }
            min = Math.min(min, a);

        }

        System.out.println(min);

    }



}