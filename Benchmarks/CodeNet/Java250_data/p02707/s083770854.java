import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] s = new int[n];

        for (String i : str) {
            s[Integer.parseInt(i) - 1]++;
        }
        for (int j : s) {
            System.out.println(j);
        }

    }
}
