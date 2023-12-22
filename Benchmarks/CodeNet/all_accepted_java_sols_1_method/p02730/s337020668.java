import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[] c = sc.next().toCharArray();
        int n = c.length;

        boolean res = true;

        for(int i=0; i<n; i++) {
            if (c[i] != c[n - 1 - i])
                res = false;
        }
        for(int i=0; i<n; i++) {
            int j = (n - 3)/2 - i;
            if(i > j) break;
            if(c[i] != c[j]) res =false;
        }
        System.out.println(res ? "Yes" : "No");
    }
}