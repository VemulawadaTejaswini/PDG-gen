import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int H = Integer.parseInt(array[0]);
            int W = Integer.parseInt(array[1]);
            int A = Integer.parseInt(array[2]);
            int B = Integer.parseInt(array[3]);

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < B; i++) {
                for (int j = 0; j < A; j++) {
                    ans.append("0");
                }
                for (int j = A; j < W; j++) {
                    ans.append("1");
                }
                ans.append("\n");
            }
            for (int i = B; i < H; i++) {
                for (int j = 0; j < A; j++) {
                    ans.append("1");
                }
                for (int j = A; j < W; j++) {
                    ans.append("0");
                }
                ans.append("\n");
            }

            System.out.print(ans.toString());
        }
    }

}
