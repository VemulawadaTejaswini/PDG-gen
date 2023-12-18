import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Harry on 5/10/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        String s = scanner.next();
        String t = scanner.next();
        int n = s.length();
        int m = t.length();
        int res = m;
        for(int i=0; i<n && i+m<=n; i++){
            int cur = 0;
            for(int j=0; j<m; j++){
                if(s.charAt(i+j)!=t.charAt(j)){
                    cur++;
                }
            }
            res = Math.min(res, cur);
        }
        System.out.println(res);
    }
}