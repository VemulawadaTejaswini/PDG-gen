import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int A = std.nextInt();
        int B = std.nextInt();
        int T = std.nextInt();

        double totalTime = T + 0.5;
        int takes = (int)totalTime / A;
        System.out.println(B * takes);
    }
}
