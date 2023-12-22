import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine = br.readLine().split(" ");
        int n = Integer.valueOf(inputLine[0]), y = Integer.valueOf(inputLine[1]);
        int b10th = 0, b5th = 0, b1th = y / 1000;
        int redundant = b1th - n;

        for (int i = 0; i <= n; i++) {
            if (redundant < 4) {
                break;
            } else if (redundant % 9 == 0 && 10 * (redundant / 9) <= b1th) {
                b10th = redundant / 9;
                b1th -= 10 * b10th;
                break;
            } else {
                redundant -= 4;
                b5th += 1;
                b1th -= 5;
            }
        }

        if (b10th + b5th + b1th != n) {
            b10th = -1; b5th = -1; b1th = -1;
        }

        System.out.println(b10th + " " + b5th + " " + b1th);
    }
}
