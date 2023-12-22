
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
        int A1 = scan.nextInt();
        int A2 = scan.nextInt();
        int A3 = scan.nextInt();
        if(A1 + A2 + A3 >= 22 )
            os.println("bust");
        else
            os.println("win");
    }
}