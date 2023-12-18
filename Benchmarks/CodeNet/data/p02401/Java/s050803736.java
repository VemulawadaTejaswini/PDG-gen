import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader std = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] line = std.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[2]);
            
            if(line[1].equals("+")) System.out.println(a + b);
            else if (line[1].equals("-")) System.out.println(a - b);
            else if (line[1].equals("*")) System.out.println(a * b);
            else if (line[1].equals("/")) System.out.println(a / b);
            else break;
        }
        
    }
}