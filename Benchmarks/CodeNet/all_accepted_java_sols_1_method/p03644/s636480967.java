import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        int a = 0;
        while (ans <= n) {
            ans = ans * 2;
        }
        System.out.println(ans / 2);
    }
}