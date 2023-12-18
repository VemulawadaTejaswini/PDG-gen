import java.util.ArrayDeque;
import java.util.Deque;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int w = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < s.length(); i++) {
            if (i % w == 0) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println("");
    }
}
