import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str_xy = br.readLine().split(" ");
        long x = Long.parseLong(str_xy[0]);
        long y = Long.parseLong(str_xy[1]);
        int count = 1;
        while (x * 2 <= y) {
            count++;
            x *= 2;
        }
        
        System.out.println(count);
    }
}
