
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Queen> queenList;

    private static String ansQueenPermutation = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.next());
        queenList = new ArrayList<Queen>(8);
        for (int i = 0; i < k; i++) {
            int r = Integer.parseInt(scan.next());
            int c = Integer.parseInt(scan.next());
            queenList.add(new Queen(r, c));
        }
        scan.close();

        permutation("01234567", "");

        for (int i = 0; i < 8; i++) {
            int queen = Integer.parseInt(ansQueenPermutation.substring(i, i + 1));
            for (int j = 0; j < 8; j++) {
                if (j == queen) {
                    System.out.print("Q");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }

    private static void permutation(String s, String ans) {
        if (s.length() == 1) {
            String permu = ans + s;
            int[] permuR = new int[8];
            int[] permuC = new int[8];
            for (int i = 0; i < 8; i++) {
                permuR[i] = i;
                permuC[i] = Integer.parseInt(permu.substring(i, i + 1));
            }

            // 入力の制約チェック
            for (Queen queen : queenList) {
                if (queen.c != permuC[queen.r]) {
                    return;
                }
            }

            // 斜め方向の制約チェック
            for (int i = 0; i < 8; i++) {
                for (int j = i + 1; j < 8; j++) {
                    if (permuR[i] - permuR[j] == permuC[i] - permuC[j]) {
                        return;
                    }
                    if (permuR[i] + permuC[i] == permuR[j] + permuC[j]) {
                        return;
                    }
                }
            }

            ansQueenPermutation = permu;
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
        }
    }

    static class Queen {
        int r;
        int c;

        public Queen(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

}

