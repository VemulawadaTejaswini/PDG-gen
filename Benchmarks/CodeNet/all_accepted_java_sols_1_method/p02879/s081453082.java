import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String[] inp = s.split(" ");

        int a,b;
        a=Integer.parseInt(inp[0]);
        b=Integer.parseInt(inp[1]);

        if((a>=1 && a<=9) && (b>=1 && b<=9))
        {
            System.out.println(a*b);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
