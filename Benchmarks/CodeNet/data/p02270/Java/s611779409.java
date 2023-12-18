import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] t = createListInt(br);
        int n = t[0];
        int m = t[1];
        int[] list = new int[n];
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            list[i] = ip(br);
            sum += list[i];
            max = Math.max(max, list[i]);
        }
        int left = max;
        int right = sum;
        while (left < right) {
            int mid = (left + right) / 2;
            int id = 0;
            sum = 0;
            for (int i = 0; i < n; i++) {
                if (sum + list[i] > mid) {
                    sum = list[i];
                    id++;
                } else {
                    sum += list[i];
                }
                if (id == m) {
                    break;
                }
            }
            if (id == m) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println(left);

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