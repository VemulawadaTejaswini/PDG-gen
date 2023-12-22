import java.util.Scanner;

class Main {
    public static void main(String...args) {
        Scanner stdin = new Scanner(System.in);
        int time = stdin.nextInt();
        int h = time / 3600;
        int m = time % 3600 / 60;
        int s = time % 60;

        System.out.println(h + ":" + m + ":" + s);
    }
}