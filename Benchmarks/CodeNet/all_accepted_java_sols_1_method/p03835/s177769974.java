import java.util.*;
import java.io.*;
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int k=Integer.parseInt(st.nextToken());
        int s=Integer.parseInt(st.nextToken());
        int count=0;
        for(int i=0;i<=k;i++){
            if(i>s) break;
            for(int j=0;j<=k;j++){
                if(i+j>s) break;
                if((s-(i+j))<=k) count+=1;
            }
        }System.out.println(count);
    }
    
}
