import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cycle = 0;
        String line;
        while(!((line = br.readLine()).equals("0"))) 
            System.out.println("Case " + ++cycle + ": " + line);
    }
}