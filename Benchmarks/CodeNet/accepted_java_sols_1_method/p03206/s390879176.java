import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int d = sc.nextInt();
        int eve = 25 - d;
        StringBuilder sb = new StringBuilder("Christmas");
        for (int i = 0; i < eve; i++) {
            sb.append(" Eve");
        }
        System.out.println(sb);
    }
}