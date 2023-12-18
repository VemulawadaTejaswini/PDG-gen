import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String ans = "";
        while (true) {
            long c = n % 26;
            if (c == 0) {
                c = 26;
            }
            ans = String.valueOf((char)(0x60 + c)) + ans;
            if (n <= 26) {
                break;
            }
            n--;
            n /= 26;
        }
        System.out.println(ans);
    }
}
