import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int blackH = Integer.parseInt(sc.next());
        int blackW = Integer.parseInt(sc.next());

        int result = h * w - (blackH * w + blackW * h - blackH * blackW);

        System.out.println(result);
    }
}