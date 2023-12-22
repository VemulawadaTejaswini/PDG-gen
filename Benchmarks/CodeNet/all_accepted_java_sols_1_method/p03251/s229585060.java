import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int maxX = -101;
        int minY = 101;

        int currentX = -101;
        int currentY = -101;
        for (int i = 0; i < N; i++) {
            currentX = sc.nextInt();
            if (currentX > maxX) {
                maxX = currentX;
            }
        }
        for (int i = 0; i < M; i++) {
            currentY = sc.nextInt();
            if (currentY < minY) {
                minY = currentY;
            }
        }

        if (maxX < minY && maxX != minY && maxX > X && minY < Y) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }

        sc.close();
    }
}
