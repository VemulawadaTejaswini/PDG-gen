import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monsterHealth = scanner.nextInt();
        int n = scanner.nextInt();
        int totalSum = 0;
        for (int i = 0; i < n; i++) totalSum += scanner.nextInt();
        if (monsterHealth <= totalSum) System.out.println("Yes");
        else System.out.println("No");
    }
}
