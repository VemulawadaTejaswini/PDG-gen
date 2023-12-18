import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // 整数aの入力
        int a = sc.nextInt();
        // 整数bの入力
        int b = sc.nextInt();
        // 出力
        System.out.println(((a % 2)==0 || (b % 2) == 0) ? "Even" : "Odd");
        sc.close();
    }
}
