import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main
{
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
        String s = r.readLine();
        String[] sl = s.split("[\\s]+");
        int n = Integer.parseInt(sl[0]);
        int x = Integer.parseInt(sl[1]);
        
        int min = 999999;
        int sum = 0;
        
        for(int i = 0; i < n; i++)
        {
          int z = Integer.parseInt(r.readLine());
          sum += z;
          min = Math.min(min, z);
        }
        
        System.out.println(n + (x - sum) / min);
        
    }
    
}
