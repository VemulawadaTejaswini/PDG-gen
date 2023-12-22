import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        int a = c[1][0] - c[0][0];
        int b = c[2][0] - c[1][0];
        int x = c[0][1] - c[0][0];
        int y = c[0][2] - c[0][1];
        boolean correct = true;
        if (c[1][1] != c[0][0] + x + a) correct = false;
        if (c[1][2] != c[0][0] + x + y + a) correct = false;
        if (c[2][1] != c[0][0] + x + a + b) correct = false;
        if (c[2][2] != c[0][0] + x + y + a + b) correct = false;
        if (correct) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}