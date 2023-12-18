import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = nextInt(scanner);
        int w = nextInt(scanner);
        int m = nextInt(scanner);

        Map<Integer, Integer> hb = new HashMap<>();
        Map<Integer, Integer> wb = new HashMap<>();

        int[] hbhbh = new int[m + 1];
        int[] wbwbw = new int[m + 1];

        for (int i = 1; i < m + 1; i++) {
            int nhb = nextInt(scanner);
            hbhbh[i] = nhb;
            int nwb = nextInt(scanner);
            wbwbw[i] = nwb;
            if (hb.containsKey(nhb)) {
                hb.replace(nhb, hb.get(nhb) + 1);
            } else {
                hb.put(nhb, 1);
            }
            if (wb.containsKey(nwb)) {
                wb.replace(nwb, wb.get(nwb) + 1);
            } else {
                wb.put(nwb, 1);
            }
        }
        int sum = 0;
        int max = 0;
        int iH = 0;
        int iW = 0;
        for (int i = 1; i < h + 1; i++) {
            if (hb.containsKey(i)) {
                int hhh = hb.get(i);
                if (max < hhh) {
                    max = hhh;
                    iH = i;
                }
            }
        }
        sum += max;
        max = 0;
        for (int i = 1; i < w + 1; i++) {
            if (wb.containsKey(i)) {
                int www = wb.get(i);
                if (max < www) {
                    max = www;
                    iW = i;
                }
            }
        }
        for (int i = 1; i < m + 1; i++) {
            if (hbhbh[i] == iH && wbwbw[i] == iW) {
                max--;
            }
        }
        sum += max;

        System.out.println(sum);
    }




    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

    private static long nextLong(Scanner scanner) {
        return Long.parseLong(scanner.next());
    }

    private static float nextFloat(Scanner scanner) {
        return Float.parseFloat(scanner.next());
    }

    private static double nextDouble(Scanner scanner) {
        return Double.parseDouble(scanner.next());
    }


}







