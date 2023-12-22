import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String arg[]) throws IOException
    {
        String str = null;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        str = br.readLine();

        int i = Integer.parseInt(str);

        System.out.println(i*i*i);
    }

}

