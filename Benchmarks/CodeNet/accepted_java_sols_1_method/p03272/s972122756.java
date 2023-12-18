import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        sc.close();

        int ans = n - (i - 1);
        System.out.println(ans);
    }

}
