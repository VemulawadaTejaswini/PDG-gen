import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ", 0);
        
        double a = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            a = Double.parseDouble(line[i]);
            sum += 1 / a;
        }
        
        System.out.println(1 / sum);
    }
}