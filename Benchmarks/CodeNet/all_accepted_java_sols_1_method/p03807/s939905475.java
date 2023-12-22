import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int array[]= new int[n + 1];
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for(int i = 1;i <= n;i++){
            int a = Integer.parseInt(st.nextToken());
            if(a % 2 == 1)++cnt;
        }
        if(cnt % 2 == 1){
            System.out.println("NO");
        }
        else System.out.println("YES");
    }
}
