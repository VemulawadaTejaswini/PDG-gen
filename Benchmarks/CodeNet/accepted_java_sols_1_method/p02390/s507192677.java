import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (0 <= s && s < 86400) {

            int m = s / 60;
            int h = m / 60;
            int mm=m%60;
            int ss = s % 60;

            System.out.println(h + ":" + mm + ":" + ss);
        }
    }
}