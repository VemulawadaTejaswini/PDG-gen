import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] s = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
            if (s[0] == -1 && s[1] == -1 && s[2] == -1) {
                break;
            }
            if (s[0] == -1 || s[1] == -1) {
                System.out.println("F");
            } else if (s[0] + s[1] >= 80) {
                System.out.println("A");
            } else if (s[0] + s[1] >= 65) {
                System.out.println("B");
            } else if (s[0] + s[1] >= 50) {
                System.out.println("C");
            } else if (s[0] + s[1] >= 30) {
                if (s[2] >= 50) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }
            } else if (s[0] + s[1] < 30) {
                System.out.println("F");
            }
        }
    }
}