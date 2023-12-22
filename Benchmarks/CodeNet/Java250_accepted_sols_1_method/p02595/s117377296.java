import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int points = in.nextInt();
        long dist = in.nextLong();
        dist = dist * dist;

        int answer = 0;
        for (int i = 0; i < points; i++) {
            long p = in.nextLong();
            long q = in.nextLong();
            long d = (p * p) + (q * q);
            if (d <= dist) answer += 1;
        }

        System.out.println(answer);
    }
}