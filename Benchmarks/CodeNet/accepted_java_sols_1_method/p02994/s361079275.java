import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();

        int total = 0;
        int min = 100000;
        int minV = 0;
        for (int i = l; i < n + l; i++) {
            total += i;
            if (Math.abs(i) < min) {
                min = Math.abs(i);
                minV = i;
            }
        }

        System.out.println(total - minV);

    }
}
