
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(in.readLine());
        String str=in.readLine();
        int n=str.length();
        if(n<=k)
            System.out.println(str);
        else
            System.out.println(str.substring(0,k)+"...");
    }
}
