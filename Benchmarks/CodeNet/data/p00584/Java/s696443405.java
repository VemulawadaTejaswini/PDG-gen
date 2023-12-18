import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0661
 *  2020/5/6
 */
public class Main {


    void printMap(int[][] map) {
        if (true)
            return;
        for(int y = 0; y < 2; y++) {
            for(int x = 0; x < map.length; x++) {
                log.printf("%2d ", map[x][y]);
            }
            log.printf("\n");
        }
        log.printf("\n");
    }

    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int[][] map = new int[N][2];
        long t = 0;
        for(int i = 0; i < N * 2; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;

            if (X < 0) {
                t += -X;
                X = 0;
            }
            else if (X >= N) {
                t += X - N + 1;
                X = N - 1;
            }
            if (Y < 0) {
                t += -Y;
                Y = 0;
            }
            else if (Y >= 2) {
                t += Y - 2 + 1;
                Y = 2 - 1;
            }
            map[X][Y]++;
            log.printf("i = %d t = %d\n", i ,t);
        }

        for(int x = 0; x < N; x++) {
            map[x][0]--;
            map[x][1]--;
        }
        long t0 = t;
        t = 0;

        printMap(map);

        for(int x = 0; x < N; x++) {
            int m = 0;
            if (map[x][0] > 0) {
                if (map[x][1] < 0) {
                    if (map[x][1] <= -map[x][0]) {
                        m = -map[x][0];
                    }
                    else {
                        m = map[x][1];
                    }
                    map[x][0] += m;
                    map[x][1] -= m;
                    t += Math.abs(m);
                    printMap(map);
                }
            }
            if (map[x][0] < 0) {
                if (map[x][1] > 0) {
                    if (map[x][1] >= -map[x][0]) {
                        m = -map[x][0];
                    }
                    else {
                        m = map[x][1];
                    }
                    map[x][0] += m;
                    map[x][1] -= m;
                    t += Math.abs(m);
                    printMap(map);
                }
            }
            if (map[x][0] != 0) {
                // 残りは全部右へ
                t += Math.abs(map[x][0]);
                map[x + 1][0] += map[x][0];
                map[x][0] = 0;
                printMap(map);
            }
            if (map[x][1] != 0) {
                // 全部右へ
                t += Math.abs(map[x][1]);
                map[x + 1][1] += map[x][1];
                map[x][1] = 0;
                printMap(map);
            }
        }
        log.printf("t = %d\n",  t);
        result.printf("%d\n",  t0 + t);

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


