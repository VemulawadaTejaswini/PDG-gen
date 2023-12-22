import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);

        System.out.println(h / a + (h % a > 0 ? 1 : 0));
    }
}