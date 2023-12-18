import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            n--;
            sb.append((char)('a' + n % 26));
            n /= 26;
        }
        System.out.println(sb.reverse());
    }
}
