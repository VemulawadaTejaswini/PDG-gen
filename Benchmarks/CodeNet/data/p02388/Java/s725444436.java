import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("xの値を入力してください。");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("xの3乗は" + x * x * x);
        sc.close();
    }
}
