import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i,j,k,cnt;
        int[] n = new int[990];
        String[] str = new String[990];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            str = in.readLine().split(" ");
            for(i=0;i<2;i++){
                n[i]=Integer.parseInt(str[i]);   
            } 
            cnt=0;
            if(n[0]==0 && n[1]==0) break; 
            for(i=1;i<=n[0];i++){
                for(j=i+1;j<=n[0];j++){
                    for(k=j+1;k<=n[0];k++){
                        cnt+=(i+j+k==n[1] ? 1 : 0);
                    }
                } 
            }
            System.out.println(cnt);
        }
        System.out.flush();
    }
}