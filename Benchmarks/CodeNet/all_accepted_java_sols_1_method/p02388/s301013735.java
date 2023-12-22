import java.util.Scanner;
public class Main {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = x * x * x;
        System.out.println(ans);
        sc.close();
    }
}
