import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        Dice d = new Dice(lines);
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] order = br.readLine().split(" ");
            System.out.println(d.getRight(order));
        }
    }
}

class Dice {
    String[] s = new String[6];
    int[] d = { 0, 1, 2 };

    Dice(String[] s) {
        this.s = s;
    }

    String getNumber() {
        return s[d[0]];
    }

    void roll(char n) {
        int a = 0;
        int b = 0;
        switch (n) {
        case 'N':
            a = 0;
            b = 1;
            break;
        case 'E':
            a = 2;
            b = 0;
            break;
        case 'S':
            a = 1;
            b = 0;
            break;
        case 'W':
            a = 0;
            b = 2;
            break;
        }
        int temp = d[a];
        d[a] = d[b];
        d[b] = 5 - temp;
    }

    String getRight(String[] list) {
        for (int i = 0; i < 3; i++) {
            if (getNumber().equals(list[0])) {
                break;
            }
            roll('N');
        }
        for (int i = 0; i < 3; i++) {
            if (s[d[1]].equals(list[1])) {
                break;
            }
            horizontalRoll();
        }
        return s[d[2]];
    }

    void horizontalRoll() {
        int temp = d[1];
        d[1] = d[2];
        d[2] = 5 - temp;
    }
}