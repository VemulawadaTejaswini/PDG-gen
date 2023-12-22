import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i <= 11) {
            if (n > Math.pow(26, i)) {
                n -= Math.pow(26, i++);
                continue;
            }
            n -= 1;
            for (int j = 0; j < i; j++) {
                sb.append((char) (n % 26 + 'a'));
                n /= 26;
            }
            break;
        }
        System.out.println(sb.reverse());
    }

}
