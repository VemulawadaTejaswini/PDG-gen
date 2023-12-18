import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        char[] data = scan.next().toCharArray();
        int most_left_white = N;
        for (int i = 0; i < N; i++) {
            if (data[i] == 'W') {
                most_left_white = i;
                break;
            }
        }
        int most_right_red = -1;
        for (int i = N - 1; 0 <= i; i--) {
            if (data[i] == 'R') {
                most_right_red = i;
                break;
            }
        }
        if (most_right_red <= most_left_white) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        while(most_left_white < most_right_red) {
            ans += 1;
            data[most_left_white] = 'R';
            data[most_right_red] = 'W';
            most_left_white += 1;
            while(data[most_left_white] == 'R' && most_left_white < N) {
                most_left_white += 1;
            }
            most_right_red -= 1;
            while(data[most_right_red] == 'W' && most_right_red < N) {
                most_right_red -= 1;
            }
        }
        System.out.println(ans);
    }
}
