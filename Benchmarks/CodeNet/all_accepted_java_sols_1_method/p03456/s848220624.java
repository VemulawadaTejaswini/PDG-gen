import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        
        String[] line = reader.readLine().split(" ");
        double num = Math.sqrt(Integer.parseInt(line[0] + line[1]));
        
        if(num == Math.rint(num)){ writer.println("Yes");
        }else{ writer.println("No"); }
        
        reader.close();
        writer.close();
    }
}