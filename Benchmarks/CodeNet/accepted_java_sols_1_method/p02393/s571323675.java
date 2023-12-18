import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //1 番目の数と 2 番目の数を比べて逆順ならば交換する。
        //2 番目の数と 3 番目の数を比べて逆順ならば交換する。
        //1 番目の数と 2 番目の数を比べて逆順ならば交換する。

        int tmp;
        if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        } if (b > c) {
            tmp = c;
            c = b;
            b = tmp;
        } if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        System.out.println(""+a+' '+b+' '+c);
    }
}
