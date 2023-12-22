import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] sl = str.split(" ");
        int N = Integer.parseInt(sl[0]);
        int Y = Integer.parseInt(sl[1]);
        int[] ans = {-1,-1,-1};
        for (int i=N;i>=0;i--){
            for (int j=N-i;j>=0;j--){
                for (int k=N-i-j;k>=0;k--){
                    if (i+j+k!=N){
                        continue;
                    }
                    if (i*10000+j*5000+k*1000==Y){
                        ans[0] = i;
                        ans[1] = j;
                        ans[2] = k;
                    }
                }
            }
        }
        for (int i=0;i<3;i++){
            System.out.println(ans[i]);
        }
    }
}