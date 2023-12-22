import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int n = sc.nextInt();
        int[] w = new int[n];
        for(int i=0;i<n;i++) w[i] = sc.nextInt();
        int sum = 0;
        for(int c:w) sum += c;
        int pre = w[0], ans = Math.abs(sum-2*pre);
        for(int i=1;i<n-1;i++){
            pre += w[i];
            ans = Math.min(ans,Math.abs(sum-2*pre));
        }
        System.out.println(ans);
    }
}

