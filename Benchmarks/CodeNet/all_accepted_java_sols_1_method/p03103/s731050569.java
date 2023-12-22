import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static int n,m,C;
    //static int[] A,B;
    static HashSet<Integer>[] graph;
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int[][] rec = new int[n][2];
        for(int i=0;i<n;i++){
            int a=sc.nextInt(), b=sc.nextInt();
            rec[i][0] = a; rec[i][1] = b;
        }
        Arrays.sort(rec,(a,b)->(a[0]-b[0])); // sort by price each
        long ans = 0, num = 0;
        for(int i=0;i<n;i++){
            long cur = Math.min(rec[i][1],m-num);
            ans += ((long)rec[i][0])*cur;
            num += cur;
            if(num==m) break;
        }
        System.out.println(ans);
    }
}