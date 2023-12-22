import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final String line = sc.nextLine();
            final int players = Integer.parseInt(line.split(" ")[0]);
            final int initScore = Integer.parseInt(line.split(" ")[1]);
            final int rounds = Integer.parseInt(line.split(" ")[2]);
            final int[] scores = new int[players];
            for (int i = 0; i < rounds; i++) {
                final int player = sc.nextInt() - 1;
                scores[player]++;
            }
            for (int playerScore : scores) {
                final String result = initScore - (rounds - playerScore) > 0 ? "Yes" : "No";
                System.out.println(result);
            }
        }
    }
}