
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pre = -1;
        int cur = 0;
        int count = 0;
        for(int i=0;i<N;i++){
            int now = Integer.parseInt(st.nextToken());
            if(now!=pre){
                count += cur/2;
                pre = now;
                cur = 1;
            }else{
                cur++;
            }
        }
        count += cur/2;
        System.out.println(count);
    }
}
