import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String[] str=buf.readLine().split(" ");
        
        int x=Integer.parseInt(str[0]);
        int y=Integer.parseInt(str[1]);
        int ans;
        while(true){
            ans=x%y;
            x=y;
            y=ans;
            if(x%y==0)break;
        }
        System.out.println(ans);
    }
}