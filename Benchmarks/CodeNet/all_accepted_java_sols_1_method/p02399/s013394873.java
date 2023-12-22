import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader stdId = new BufferedReader(new InputStreamReader(System.in));
        String[] std = stdId.readLine().split(" ");
        
        int a = Integer.parseInt(std[0]);
        int b = Integer.parseInt(std[1]);
        
        int d = a/b;
        int r = a%b;
        double f = (double)a/(double)b;
        
        System.out.printf("%d %d %5f", d,r,f);
        
    }
}