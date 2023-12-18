import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int h = num / 3600, m, s;

        num %= 3600;
        m = num/60;
        num %= 60;
        s = num;

        System.out.println(h + ":" + m + ":" + s);
    }
}