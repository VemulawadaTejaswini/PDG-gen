import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        String s = "";

        while(n > 0) {
            n--;
            s = (char)('a' + n % 26) + s;
            n /= 26;
        }
        System.out.println(s);
    }
}
