import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long maxLen = 1L;
        while (y >= x * (long) Math.pow(2, maxLen)) {
            maxLen++;
        }
        System.out.println(maxLen);
    }

}
