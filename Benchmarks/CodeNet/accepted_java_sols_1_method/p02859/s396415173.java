import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int ans = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str = null;

        str = br.readLine();

        int r = Integer.parseInt(str);

        ans = r*r;

        System.out.println(ans);
    }

}