import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int x = Integer.parseInt(line[2]);
        
        if ((x >= a) && (a + b >= x)) System.out.println("YES");
        else System.out.println("NO");
    }
}
