import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int temp = r * x - d;
        int ans = temp;
        System.out.println(temp);
        for (int i = 0; i < 9; i++) {
            ans = r * temp - d;
            System.out.println(ans);
            temp = ans;
        }
    }
}