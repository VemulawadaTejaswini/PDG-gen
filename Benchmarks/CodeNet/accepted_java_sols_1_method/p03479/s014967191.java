import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long count = 0;
        long now = x;
        while (true) {
            if (now <= y) {
                count++;
            } else {
                break;
            }
            now = now * 2;
        }
        System.out.println(count);

    }
}