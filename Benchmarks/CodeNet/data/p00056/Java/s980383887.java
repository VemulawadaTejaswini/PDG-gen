import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
 
        // エラトステネスの篩
        int MAX = 50000;
        boolean[] prime = new boolean[MAX + 1];
        Arrays.fill(prime, true);
        
        prime[0] = false; 
        prime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (prime[i] == false)
                continue;
            for (int j = i * 2; j <= MAX; j += i)
                prime[j] = false;
        }
 
        try {
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.equals("0"))
                    break;
                int count = 0;
                int N = Integer.parseInt(line);
 
                for (int start = 1; start <= N / 2; start++) {
                    if (prime[start] == true && prime[N - start] == true)
                        count++;
                }
 
                System.out.println(count);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}