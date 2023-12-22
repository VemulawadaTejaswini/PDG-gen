import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String[] str=buf.readLine().split(" ");
        
        int x=Integer.parseInt(str[0]);
        int y=Integer.parseInt(str[1]);
        int ans=0,flg=1;
        if(x==y){
            System.out.println(x);
            flg=0;
        }
        while(flg==1){
            ans=x%y;
            x=y;
            y=ans;
            if(x%y==0){
                System.out.println(ans);break;
            }
        }
    }
}