import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        String answer = "No";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j * i == N) {
                    answer = "Yes";
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}