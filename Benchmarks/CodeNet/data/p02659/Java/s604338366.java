
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String argps[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine());
        Long a=Long.parseLong(st.nextToken());
        double b=Double.parseDouble(st.nextToken());
        b*=100;
        long c=(long)(b);
        long res=a*c;
        res/=100;
        System.out.println(res);
    }
}
