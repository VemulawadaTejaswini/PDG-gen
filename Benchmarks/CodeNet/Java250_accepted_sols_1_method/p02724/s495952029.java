import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        long a = sc.nextLong(),b = 0;
        if(a >= 500) {
            b = (a / 500) * 1000;
            a %= 500;
        }
        if(a >= 5) b += (a / 5) * 5;
        System.out.println(b);
    }
}






