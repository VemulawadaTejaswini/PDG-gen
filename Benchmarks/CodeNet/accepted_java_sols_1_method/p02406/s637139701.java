import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            } else {
                String s = String.valueOf(i);
                if (s.contains("3")) {
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println();
    }
}