import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        if(x > y) {
            System.out.print("No");
            return;
        }

        int t = (y - 2 * x) / 2;
        if(t <= x) {
            System.out.print("Yes");
            return;
        }
        System.out.print("No");
    }
}