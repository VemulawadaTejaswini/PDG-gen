import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int n = 0;
        if (k%2 == 1) {
            System.out.println((k/2) * (k/2+1));
        }
        else System.out.println((k/2)*(k/2));
        
        
    }
}
