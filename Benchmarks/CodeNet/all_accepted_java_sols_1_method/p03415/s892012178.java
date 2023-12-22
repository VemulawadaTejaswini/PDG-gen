import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] c = new char [3][];
        for (int i = 0; i < 3; i++) {
            c[i] = sc.next().toCharArray();
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(c[i][j]);
            }

        }
    }
}