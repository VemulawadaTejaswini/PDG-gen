import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] data = in.readLine().split(" ");
        long x = Long.parseLong(data[0]);
        long k = Long.parseLong(data[1]);
        long d = Long.parseLong(data[2]);
        x = Math.abs(x);
        while (d < x && k > 0) {
            x -= d;
            k--;
        }
        if (k == 0 || k % 2 == 0) {
            System.out.println(x);
            return;
        } else {
            System.out.println(d - x);
        }
    }
}
