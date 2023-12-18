import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
 
        boolean[] primes = new boolean[1000000];
        int[] counts = new int[1000000];
 
        for (int i = 2; i < 1000000 / 2 + 1; i++) {
            if (!primes[i]) {
                for (int j = 2; j < 999999 / i + 1; j++) {
                    primes[i * j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < 1000000; i++) {
            if (!primes[i]) {
                count++;
            }
            counts[i] = count;
        }
 
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            System.out.println(counts[Integer.parseInt(line)]);
        }
    }
}