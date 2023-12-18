import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lines = line.split(" ", 0);
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        System.out.println((n*m) + " " + (2*n+2*m));
    }
}