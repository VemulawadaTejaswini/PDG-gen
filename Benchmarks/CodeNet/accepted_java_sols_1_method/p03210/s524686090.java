import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((x == 7 || x == 5 || x == 3) ? "YES" : "NO");
    }
}
