import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String[] in = br.readLine().split(" ");
            
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            
            br.close();
 
            System.out.println(a * b);

        }
    }
}