import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        
        StringBuilder ans = new StringBuilder(br.readLine());
        
        ans.setCharAt(3, '8');
        
        writer.println(ans.toString());
        
        br.close();
        writer.close();
    }
}