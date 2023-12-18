import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int t = -sc.nextInt() * 3600 - sc.nextInt() * 60 - sc.nextInt() + sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
            System.out.println(t / 3600 + " " + t % 3600 / 60 + " " + t % 3600 % 60);
        }
    }
}
