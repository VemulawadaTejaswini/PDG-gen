import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();
        int b = c.nextInt();
        int tower[] = new int[1000];
        int k = 0;
        for (int i = 1; i <= 999; i++) {
            k = k + i;
            tower[i] = k;
        }
        if (b - a == tower[b - a] - tower[b - a - 1]) {
            System.out.println(tower[b - a -1] - a);
        }
    }
}
