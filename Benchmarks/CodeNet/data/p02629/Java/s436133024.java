import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String ans = "";
        while (n > 0){
            ans = (char) ('a' + n % 26 - 1) + ans;
            n /= 26;
        }
        System.out.println(ans);
    }
}