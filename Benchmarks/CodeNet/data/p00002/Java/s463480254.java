import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String t;
        while((t=buf.readLine())!=null){
            String str[]=buf.readLine().split(" ");
            int x=Integer.parseInt(str[0]);
            int y=Integer.parseInt(str[1]);
         
            if(0<=x && x<=1000000 && 0<=y && y<=1000000){
                int sum=x+y;
                System.out.println(Integer.toString(sum).length());
            }
        }
    }
}