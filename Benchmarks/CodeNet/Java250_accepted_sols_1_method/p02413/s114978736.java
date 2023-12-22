import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();

        int number[][] = new int[h + 1][w + 1];

        for (int i = 0; i < h;i++) {
            for (int j = 0; j < w;j++) {
                number[i][j] = scan.nextInt();
                number[i][w] += number[i][j];
                number[h][j] += number[i][j];
            }
            number[h][w] += number[i][w];
        }

        for (int i = 0;i < h + 1;i++) {
            for (int j = 0;j < w + 1;j++) {
                System.out.print(number[i][j]);
                if(j == w) {
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}