import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int idx=Integer.parseInt(buf.readLine()); 
        int ans=0;
        for(int i=0;i<idx;i++){
            int x=Integer.parseInt(buf.readLine());
            int flg=0;
            
            if(x==2){
                flg=0;
            }else if(x%2==0 || x<2){
                flg=1;
            }else{
                double sqrt=Math.sqrt(x);
                for(int j=3;j<=sqrt;j+=2){
                    if(x%j==0){
                        flg=1;break;
                    }
                }
            }
            if(flg==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}