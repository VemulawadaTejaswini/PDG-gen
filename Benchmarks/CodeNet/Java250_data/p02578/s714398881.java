import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int N = (int) in.nval;
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            in.nextToken();
            a[i] = (int) in.nval;
        }
        int j = 0;
        double ans = 0;
        for(int i = 1; i < N; i++){
            if(a[i] < a[j]){
                ans += (a[j] - a[i]);
            }else{
                j = i;
            }
        }
        System.out.format("%.0f",ans);
        System.out.println();
    }
}
