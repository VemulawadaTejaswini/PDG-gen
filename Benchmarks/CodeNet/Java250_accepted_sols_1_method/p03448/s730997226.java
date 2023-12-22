import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int A = cin.nextInt();
        int B = cin.nextInt();
        int C = cin.nextInt();
        int X = cin.nextInt();
        int cnt = 0;
        for (int a = 0; a <= A; a++) {
            for (int b = 0; b <= B; b++) {
                for (int c = 0; c <= C; c++) {
                    int x = (a * 500) + (b * 100) + (c * 50);
                    if (x == X) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}