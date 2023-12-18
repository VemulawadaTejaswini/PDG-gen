
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
        int N = scan.nextInt();

        switch (N%10) {
            case 0:
            case 1:
            case 6:
            case 8:
                os.println("pon");
                break;
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
                os.println("hon");
                break;
            case 3:
                os.println("bon");
        }

    }
}