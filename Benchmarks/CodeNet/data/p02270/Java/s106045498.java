import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] t = createListInt(br);
        int n = t[0];
        int m = t[1];
        int[] list = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            list[i] = ip(br);
            sum += list[i];
        }
        Arrays.sort(list);
        int average = sum / m;
        if (sum % m != 0) {
            average++;
        }
        int j = 0;
        int min = 0;
        for (int i = n - 1; i >= j; i--,j++) {
            if (list[i] == average) {
                min = average;
                break;
            } else if (list[i] > average) {
                min = list[i];
                break;
            } else {
                min = list[i] + list[j];
                break;
            }
        }
        System.out.println(min);

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