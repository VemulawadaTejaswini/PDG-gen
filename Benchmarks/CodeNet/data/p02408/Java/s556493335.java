import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] having = new boolean[4][13];
        String[] nameOfSuit = {"S", "H", "C", "D"};
        int num = sc.nextInt();
        int i;
        String suit;
        int rank;
        for (i = 0; i < num; i++) {
            suit = sc.next();
            rank = sc.nextInt();
            if (suit.equals(nameOfSuit[0])) having[0][rank - 1] = true;
            else if (suit.equals(nameOfSuit[1])) having[1][rank - 1] = true;
            else if (suit.equals(nameOfSuit[2])) having[2][rank - 1] = true;
            else if (suit.equals(nameOfSuit[3])) having[3][rank - 1] = true;
        }
        int s, r;
        for (s = 0; s < 4; s++) {
            for (r = 1; r <= 13; r++) {
                if (having[s][r - 1] == false) {
                    System.out.println(nameOfSuit[s] + " " + r);
                }
            }
        }
    }
}
