import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0592
 *  2020/5/10
 */
public class Main {

    PrintStream log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    PrintStream result = System.out;
    Scanner sc = new Scanner(System.in);

    void main() throws IOException {

        //int N = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < 5; i++) {
            int t = sc.nextInt();
            sum += Math.max(t, 40);
        }

        result.println(sum / 5);
    }

    public static void main(String[] args) throws IOException {
        new Main().main();
    }


}


