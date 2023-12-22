import java.util.ArrayDeque;
import java.util.Deque;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str_as = br.readLine().split(" ");
        int[] as = new int[n];
        int count = 0;
        boolean change = false;
        
        for (int i = 0; i < n; i++) {
            as[i] = Integer.parseInt(str_as[i]);
        }
        
        for (int i = 1; i < n; i++) {
            if (as[i] == as[i-1] && !change) {
                count++;
                change = true;
            }
            else change = false;
        }
        
        System.out.println(count);
    }
}
