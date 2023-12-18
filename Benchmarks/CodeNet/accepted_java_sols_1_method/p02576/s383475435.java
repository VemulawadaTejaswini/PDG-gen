import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        int ans = n / x;
        int mod = n % x;
        if(mod == 0) System.out.println(ans * t);
        else System.out.println((ans + 1) * t);
    }
}