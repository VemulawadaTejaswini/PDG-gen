import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int t = in.nextInt();
        int[]cost = new int[n];
        int[]mx = new int[n];
        int mm = 0;
        ArrayList<Integer> store = new ArrayList<>();
        for(int i =0;i<n;i++){
            cost[i] = in.nextInt();
        }
        int m =0;
        for(int i=n-1;i>=0;i--){
            mx[i]=m;
            m = Math.max(m,cost[i]);
        }
        for(int i =0;i<n;i++){
            int next = mx[i]-cost[i];
            mm = Math.max(mm,next);
            store.add(next);
        }
        int s = 0;
        for (int v:store){
            if (v==mm)
                s++;
        }
        System.out.println(s);
    }
}