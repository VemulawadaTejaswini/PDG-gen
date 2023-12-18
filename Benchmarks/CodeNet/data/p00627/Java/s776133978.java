import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 1041
 *  2020/5/10
 */
public class Main {

    PrintStream log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    PrintStream result = System.out;
    Scanner sc = new Scanner(System.in);

    void main() throws IOException {

        for(;;) {
            int N = sc.nextInt();
            if (N == 0)
                break;
            int sum = 0;
            for(int i = 0; i < N / 4; i++) {
                sum += sc.nextInt();
            }
            result.println(sum);
        }
    }

    public static void main(String[] args) throws IOException {
        new Main().main();
    }


}


