import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = br.readLine()) != null)
        {
            int count = 0;
            int n = Integer.parseInt(s);
            if(n <= 36)
            {
                if (n > 18) n = 36 - n;
                count = (n + 1) * (n + 2) * (n + 3) / 6;
                if (n > 9) count -= 2 * (n - 9) * (n - 8) * (n - 7) / 3;

            }
            System.out.println(count);
        }
    }
}
