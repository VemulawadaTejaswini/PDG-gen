import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int[] kyu = {600, 800, 1000, 1200, 1400, 1600, 1800, 2000};
        for (int i = 0; i < kyu.length; i++) {
            if (x < kyu[i]) {
                System.out.println(8 - i);
                break;
            }
        }
    }
}