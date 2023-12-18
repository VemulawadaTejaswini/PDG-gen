import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int[] list = new int[lines.length];
        for (int i = 0; i < 5; i++) {
            list[i] = Integer.parseInt(lines[i]);
        }
        if (list[2] - list[4] < 0 || list[2] + list[4] > list[0] || list[3] - list[4] < 0 || list[3] + list[4] > list[1]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}