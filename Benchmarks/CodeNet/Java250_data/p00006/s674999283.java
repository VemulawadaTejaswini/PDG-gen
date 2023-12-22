
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException
    {
        StringBuffer sBuffer = new StringBuffer();
        BufferedReader bReader = 
                new BufferedReader(new InputStreamReader(System.in));
        
        String str = bReader.readLine();
        sBuffer.append(str);
        System.out.println(sBuffer.reverse());
    }
}