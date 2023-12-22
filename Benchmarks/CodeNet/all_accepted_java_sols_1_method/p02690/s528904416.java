import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        for (long i = -120; i < 120; i++) {
            for (long j = -120; j < 120; j++) {
                long a = (long) Math.pow(i, 5);
                long b = (long) Math.pow(j, 5);
                if(a - b == x) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
