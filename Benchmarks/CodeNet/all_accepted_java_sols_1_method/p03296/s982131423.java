import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();
            if (current == prev) {
                count++;
                prev = -1;
            } else {
                prev = current;
            }
        }
        System.out.println(count);
    }
}