import java.io.*;
import java.util.*;

class Main {

    public static void main(String[]$) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] b = new int[n][n];
        int[] wait = new int[n + 1];
        wait[n] = n;
        Deque<Integer>[] deque = new Deque[n];
        for (int i = 0; i < n; i++) {
            deque[i] = new ArrayDeque<>();
            wait[i] = scanner.nextInt() - 1;
            for (int j = 2; j < n; j++) {
                deque[i].add(scanner.nextInt() - 1);
            }
        }
        int[] lastMatch = new int[n];
        int rem = n;
        while (rem > 0) {
            boolean updated = false;
            for (int i = 0; i < n; i++) {
                if (wait[wait[i]] == i) {
                    lastMatch[wait[i]] = lastMatch[i] = Math.max(lastMatch[wait[i]], lastMatch[i]) + 1;
                    updated = true;
                    if (!deque[wait[i]].isEmpty()) {
                        wait[wait[i]] = deque[wait[i]].poll();
                    } else {
                        wait[wait[i]] = n;
                        rem--;
                    }
                    if (!deque[i].isEmpty()) {
                        wait[i] = n;
                        wait[i] = deque[i].poll();
                    } else {
                        rem--;
                    }
                }
            }
            if (!updated) {
                System.out.println(-1);
                return;
            }
        }
        Arrays.stream(lastMatch).max().ifPresent(System.out::println);
    }
    
}
