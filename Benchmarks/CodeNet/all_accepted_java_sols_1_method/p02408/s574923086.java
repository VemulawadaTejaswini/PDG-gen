import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] card = new int[4][13];
        for (int i = 0; i < n; i++) {
            switch (sc.next()) {
                case "S":
                    card[0][sc.nextInt()-1]++;
                    break;
                case "H":
                    card[1][sc.nextInt()-1]++;
                    break;
                case "C":
                    card[2][sc.nextInt()-1]++;
                    break;
                case "D":
                    card[3][sc.nextInt()-1]++;
                    break;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (card[i][j] == 0) {
                    switch (i) {
                        case 0:
                            System.out.println("S " + (j+1));
                            break;
                        case 1:
                            System.out.println("H " + (j+1));
                            break;
                        case 2:
                            System.out.println("C " + (j+1));
                            break;
                        case 3:
                            System.out.println("D " + (j+1));
                            break;
                    }
                }
            }
        }
        sc.close();
    }
}
