import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if(x == 1) {
            System.out.println("0 -1");
            return;
        }
        //long xx = (long) Math.ceil(Math.sqrt(Math.cbrt(x)));
        for (long i = -200; i < 200; i++) {
            for (long j = -200; j < 200; j++) {
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
