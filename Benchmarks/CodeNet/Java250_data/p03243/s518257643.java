import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  =sc.nextInt();

        int hoge = n / 100;
        int reNum = hoge + hoge * 10 + hoge * 100;
        if (reNum < n) {
            reNum += 111;
        }

        System.out.println(reNum);
    }
}
