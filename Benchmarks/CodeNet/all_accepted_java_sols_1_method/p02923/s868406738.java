import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        int maxMovies = 0;
        int tmpMoves = 0;
        for (int i = 0; i < N - 1; i++) {
            int current = H[i];
            int next = H[i + 1];
            if (current >= next) {
                tmpMoves++;
            } else {
                tmpMoves = 0;
            }

            if (maxMovies < tmpMoves) {
                maxMovies = tmpMoves;
            }
        }

        System.out.println(maxMovies);
    }
}
