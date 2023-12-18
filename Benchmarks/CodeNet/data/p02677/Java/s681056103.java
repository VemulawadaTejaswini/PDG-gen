
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public  static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine()," ");
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        double angle=Math.abs((m*6)-(h*30+m*0.5));
        double rad=Math.toRadians(angle);
        double ans=2*a*b*Math.cos(rad);
        ans=a*a+b*b-ans;
        ans=Math.sqrt(ans);
        System.out.println(ans);
    }
}

