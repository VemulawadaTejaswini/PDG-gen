import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int ans = (k / 2) * ((k + 1) / 2);
        System.out.println(ans);
    }
}