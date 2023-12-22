import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        if ((Integer.parseInt(line[1])*10 + Integer.parseInt(line[2])) % 4 == 0) System.out.println("YES");
        else System.out.println("NO");
        
    }
}
