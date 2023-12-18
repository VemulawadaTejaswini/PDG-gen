import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long x = 1;
        for(long i=1; i<=a; i++) {
            x = (long) (i * x %(Math.pow(10, 9)+7));
        }
        System.out.println(x);
    }
}