import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        if (k != 1) {
            ans = n - k;
        }
        
        System.out.println(ans);
    }

}
