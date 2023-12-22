import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        br.readLine();
        final String[] data = br.readLine().split(" ");
        long min = Long.parseLong(data[0]);
        long max = Long.parseLong(data[0]);
        long sum = 0;
        long num = 0;
        for (String s : data) {
            num = Long.parseLong(s);
            if (max < num) {
                max = num;
            } else if (num < min) {
                min = num;
            }
            sum += num;
        }
        System.out.println(min + " " + max + " " + sum);
    }
}