import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        int[] s = new int[M];
        int[] c = new int[M];
        for (int i = 0; i < M; i++) {
            s[i] = stdIn.nextInt();
            c[i] = stdIn.nextInt();
        }
        stdIn.close();
        
        int count;
        int result = -1;
        // N = 3のとき
        if (N == 3) {
            for (int i = 100; i < 1000; i++) {
                count = 0;
                for (int j = 0; j < M; j++) {
                    if (s[j] == 1) {
                        if (i / 100 == c[j]) count++;
                    }
                    if (s[j] == 2) {
                        if ((i % 100) / 10 == c[j]) count++;
                    }
                    if (s[j] == 3) {
                        if (i % 10 == c[j]) count++;
                    }
                }
                if (count == M) {
                    result = i;
                    break;
                } 
            }
        }
        // N = 2のとき
        if (N == 2) {
            for (int i = 10; i < 100; i++) {
                count = 0;
                for (int j = 0; j < M; j++) {
                    if (s[j] == 1) {
                        if (i / 10 == c[j]) count++;
                    }
                    if (s[j] == 2) {
                        if (i % 10 == c[j]) count++;
                    }
                }
                if (count == M) {
                    result = i;
                    break;
                } 
            }
        }
        // N = 1のとき
        if (N == 1) {
            for (int i = 0; i < 10; i++) {
                count = 0;
                for (int j = 0; j < M; j++) {
                    if (i == c[j]) count++;
                }
                if (count == M) {
                    result = i;
                    break;
                } 
            }
        }
        System.out.println(result);
    }
}