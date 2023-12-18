import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0621
 *  2020/5/10
 */
public class Main {

    PrintStream log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    PrintStream result = System.out;
    Scanner sc = new Scanner(System.in);

    void main() throws IOException {

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        String[] s = new String[N];
        for(int i = 0; i < N; i++) {
            s[i] = sc.nextLine();
        }
        
        int min  = Integer.MAX_VALUE;
        
        // WBR
        for(int WL = 1; WL < N - 1; WL++) {
            for(int BL = 1; BL < N - WL; BL++) {
                //log.printf("WL BL %d %d\n", WL, BL);
                int cnt = 0;
                for(int n = 0; n < N; n++) {
                    char c = 'R';
                    if (n < WL)
                        c = 'W';
                    else if (n < WL + BL) 
                        c = 'B';
                    for(int m = 0; m < s[n].length(); m++) {
                        if (s[n].charAt(m) != c) {
                            cnt++;
                        }
                    }
                }
                log.printf("WL BL %d %d cnt = %d\n", WL, BL, cnt);
                min = Math.min(cnt, min);
            }
        }
        result.println(min);
    }

    public static void main(String[] args) throws IOException {
        new Main().main();
    }


}


