import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 3114
 *  2020/5/4
 */
public class Main {


    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int ret = -1;

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a < min) {
                min = a;
                ret = i;
            }
        }

        result.printf("%d\n", ret + 1);

        sc.close();
        return false;
    }



    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    public static void main(String[] args) throws IOException {

        instance.main();
        instance.systemin.close();
    }


}


