import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> stack = new ArrayDeque<String>();
        while (true) {
            final String line = br.readLine();
            if (line == null) break;
            if ("0".equals(line)){
                String a = stack.poll();
                System.out.println(a);
            }else{
                stack.push(line);
            }
        }
    }
}