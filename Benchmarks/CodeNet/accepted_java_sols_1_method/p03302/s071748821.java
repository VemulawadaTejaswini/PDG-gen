import java.util.ArrayDeque;
import java.util.Deque;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        
        if (a+b==15) {
            System.out.println("+");
        }
        else if (a*b==15) {
            System.out.println("*");
        }
        else {
            System.out.println("x");
        }
        
        
    }
}
