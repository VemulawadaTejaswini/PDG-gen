import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a = in.nextInt();
        int ans = 0;
        int n = 1;
        while(n <= a) {
            n *= 2;
            ans++;
        }
        System.out.println(n / 2);
    }
}