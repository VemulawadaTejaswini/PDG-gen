import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int scoreA = 0;
        int scoreB = 0;

        int nGames = scan.nextInt();
        for (int i = 0; i < nGames; i++) {
            String cardA = scan.next();
            String cardB = scan.next();

            int result = cardA.compareTo(cardB);
            if (result == 0) {
                scoreA += 1;
                scoreB += 1;
            } else if (result > 0) {
                scoreA += 3;
            } else if (result < 0) {
                scoreB += 3;
            }
        }

        System.out.printf("%d %d\n", scoreA, scoreB);
    }
}