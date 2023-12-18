import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> ad1 = new ArrayDeque<>();
        Deque<int[]> ad2 = new ArrayDeque<>();
        char[] list = br.readLine().toCharArray();

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == '\\') {
                ad1.push(i);
            } else if (list[i] == '/') {
                if (!ad1.isEmpty()) {
                    int j = ad1.pop();
                    int area = i - j;
                    sum += area;
                    while (!ad2.isEmpty() && ad2.peek()[0] > j) {
                        area += ad2.pop()[1];
                    }
                    int[] val = { j, area };
                    ad2.push(val);
                }
            }
        }
        System.out.println(sum);
        System.out.print(ad2.size());
        while(!ad2.isEmpty()){
            System.out.print(" " + ad2.pollLast()[1]);
        }
        System.out.println();
    }

    static boolean isNumber(String num) {
        return Pattern.compile("^\\-?[0-9]*\\.?[0-9]+$").matcher(num).find();
    }

    static int[] createListInt(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static long[] createListLong(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        long[] list = new long[n];
        while (n-- > 0) {
            list[n] = Long.parseLong(lines[n]);
        }
        return list;
    }

    static int ip(String s) {
        return Integer.parseInt(s);
    }

    static long lp(String s) {
        return Long.parseLong(s);
    }
}