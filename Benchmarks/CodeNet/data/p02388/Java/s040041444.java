import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String s=b.readLine();
        int a=Integer.parseInt(s);
        System.out.println(a*a*a);
    }
}