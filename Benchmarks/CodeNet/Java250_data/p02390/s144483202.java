import java.util.Scanner;

class Watch {
    static void run() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = s / 60;
        int ss = s % 60;
        int h = m / 60;
        int mm = m % 60;
        System.out.printf("%d:%d:%d%n", h, mm, ss);
    }
}
public class Main {
    public static void main(String[] args) {
        Watch.run();
    }
}