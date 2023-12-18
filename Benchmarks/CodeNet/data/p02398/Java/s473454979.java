import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
       String str=buf.readLine();
       String[] rs=str.split(" ");
       int x,y,z;
       int cnt=0;
           x=Integer.parseInt(rs[0]);
           y=Integer.parseInt(rs[1]);
           z=Integer.parseInt(rs[2]);
           for(int i=x; i<=y;i++){
           if(z % i == 0)
               cnt++;
           }
       System.out.println(cnt);
    }
}