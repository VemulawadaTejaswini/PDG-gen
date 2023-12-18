import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String str=buf.readLine();
        int x=Integer.parseInt(str);
    
        String f=String.format("%.6f",(double)x*(double)x*3.141592);
        System.out.println(f+" "+f);
    }
}