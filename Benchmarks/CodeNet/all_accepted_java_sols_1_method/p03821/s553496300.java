import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a[] = new int[n + 1];
        int b[] = new int[n + 1];
        for(int i = 1;i <= n;i++){
            st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int b1 = Integer.parseInt(st.nextToken());
            a[i] = a1;
            b[i] = b1;
        }
        long add = 0;
        for(int i = n;i >= 1;i--){
            if((a[i] + add) % b[i] == 0)continue;
            long to_add = b[i] - ((a[i] + add) % b[i]);
            add += to_add;
        }
        System.out.println(add);
    }
}