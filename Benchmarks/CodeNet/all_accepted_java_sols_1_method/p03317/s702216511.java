import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = (n - 1) / (k - 1);
        if ((n - 1) % (k - 1) != 0) {
            ans++;
        }
        System.out.println(ans);

        sc.close();
    }

}
