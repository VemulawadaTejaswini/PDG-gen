import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
        String s = r.readLine();
        char a = s.charAt(0);
        char b = s.charAt(1);
        char c = s.charAt(2);
        
        System.out.println(700 + (a == 'o' ? 100 : 0) + (b == 'o' ? 100 : 0) + (c == 'o' ? 100 : 0));
    }
    
}
