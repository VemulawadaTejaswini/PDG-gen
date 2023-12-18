import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input;
        int d, t, totalAngle = 90;
        double x = 0, y = 0;
        while (true) {
            input = br.readLine().split(",");
            d = Integer.parseInt(input[0]);
            t = Integer.parseInt(input[1]);
            if (d == 0 && t == 0) {
                break;
            }

            x += d * Math.cos(totalAngle * Math.PI / 180);
            y += d * Math.sin(totalAngle * Math.PI / 180);

            totalAngle -= t;
        }

        System.out.println(((int) x) + "\n" + ((int) y));
    }
}