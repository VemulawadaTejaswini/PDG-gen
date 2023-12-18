import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = ip(br);
        int[] list = createListInt(br);
        System.out.println(inversion(list));
       // System.out.println(bubbleSort(list));
    }

    static long inversion(int[] list) {
        long count = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    static int bubbleSort(int[] list) {
        int cnt = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = list.length - 1; j >= i + 1; j--) {
                if (list[j] < list[j - 1]) {
                    swap(list, j, j - 1);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    static boolean isNumber(String num) {
        return Pattern.compile("^\\-?[0-9]*\\.?[0-9]+$").matcher(num).find();
    }

    static int[] createListInt(BufferedReader br) throws IOException {
        String[] lines = br.readLine().split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static int ip(BufferedReader s) throws IOException {
        return Integer.parseInt(s.readLine());
    }
}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}