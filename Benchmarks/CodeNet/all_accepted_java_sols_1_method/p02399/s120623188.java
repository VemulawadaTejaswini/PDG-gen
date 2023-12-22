import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        System.out.println(a/b);
        System.out.println(a%b);
        Double da = (double) a;
        //Double db = (double) b;
        System.out.println(String.format("%.8f",da/b));
    }
}