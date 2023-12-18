import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int[] count = new int[1001];
        boolean[] first = new boolean[1001];
        boolean[] second = new boolean[1001];

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.isEmpty()) {
                break;
            }
            int c = Integer.parseInt(line.split(",")[0]);
            count[c]++;
            first[c] = true;
        }

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.isEmpty()) {
                break;
            }
            int c = Integer.parseInt(line.split(",")[0]);
            count[c]++;
            second[c] = true;
        }

        for (int c = 1; c < count.length; c++) {
            if (first[c] && second[c]) {
                System.out.println(c + " " + count[c]);
            }
        }
    }
}