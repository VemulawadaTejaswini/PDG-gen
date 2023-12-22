import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

            StringBuilder out = new StringBuilder();
            while (true) {
                int[] scores = Arrays.stream(in.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int m = scores[0];
                int f = scores[1];
                int r = scores[2];

                if (m == -1 && f == -1 && r == -1) break;

                String grade;
                if (m == -1 || f == -1) {
                    grade = "F";
                }
                else {
                    int score = m + f;
                    if (80 <= score) grade = "A";
                    else if (65 <= score && score < 80) grade = "B";
                    else if (50 <= score && score < 65) grade = "C";
                    else if (30 <= score && score < 50) {
                        grade = 50 <= r ? "C" : "D";
                    }
                    else grade = "F";
                }

                out.append(grade);
                out.append("\n");
            }
            System.out.print(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}

