import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] type = {"S", "H", "C", "D"};
        boolean[][] cards = new boolean[4][13];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String t = sc.next();
            int num = sc.nextInt();
            if (t.equals("S")) {
                cards[0][num - 1] = true;
            } else if (t.equals("H")) {
                cards[1][num - 1] = true;
            } else if (t.equals("C")) {
                cards[2][num - 1] = true;
            } else {
                cards[3][num - 1] = true;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (!cards[i][j]) {
                    System.out.println(String.format("%s %d", type[i], j + 1));
                }
            }
        }
    }
}