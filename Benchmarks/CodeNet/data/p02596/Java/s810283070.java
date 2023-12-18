import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        System.out.println(getResult(k));

    }
    public static long getResult(long k) {
        long num = 0;
        long result = -1;
        for (int i = 1; i <= 19; i++) {
            num = num*10 + 1;
            System.out.println(i+ " : " + num);
            if ((num * 7) % k == 0) {
                result = String.valueOf(num).length();
                return result;
            }

        }
        return result;
    }
}
