import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String str=buf.readLine();
        String[] ra=str.split(" ");
        
        int x=Integer.parseInt(ra[0]);
        int y=Integer.parseInt(ra[1]);
        int d,r;
       String f=String.format("%.5f",(double)x/(double)y);
        d=x/y;
        y=x%y;
        System.out.printf(d+" "+y+" "+f);
    }
}