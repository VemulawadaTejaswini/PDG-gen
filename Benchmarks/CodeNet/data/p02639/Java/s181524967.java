import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        for(int i = 0; i < 5; i++) {
            int x = scan.nextInt();
            if(x == 0){
                os.println(i+1);
                return;
            }
        }
    }
}