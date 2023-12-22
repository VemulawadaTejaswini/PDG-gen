import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine().trim()) != null && !"0".equals(line)) {
           int range = Integer.parseInt(line);
           int ans = 0;
           for(int i = 2 ; i <= range; i++) {
               if(range%i ==0 && i%2 != 0) ans++;
           }
           System.out.println(ans);
        }
    }
}
