import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] c = new char[3][3];
        for (int i = 0; i < 3; i++) {
            String temp = sc.next();
            for (int j = 0; j < 3; j++) {
                c[i][j] = temp.charAt(j);
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(String.valueOf(c[i][i]));
        }
        System.out.println();

    }
}