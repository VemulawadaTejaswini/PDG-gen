import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            if(n==0&&x==0) break;
            int count=0;
            for(int i=1;i<=n;i++){
                for(int j=i+1;j<=n;j++){
                    for(int k=j+1;k<=n;k++){
                        if(i+j+k==x) count++;
                    }
                }
            }System.out.println(count);
        }
        
    }
}