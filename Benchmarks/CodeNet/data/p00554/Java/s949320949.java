import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0631
 *  2020/5/5
 */
public class Main {


    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int sum = 0;
        int max = 0;
        
        for(int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int cnt = Math.max(N - A, 0);
            sum += cnt;
            max = Math.max(max, cnt);
        }

        result.printf("%d\n", sum - max);

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


