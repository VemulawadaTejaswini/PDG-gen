import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                ans = i * 4 + j * 7;
                if(ans == n) {
                    System.out.println("Yes");
                    return;
                }
                if(ans > n) {
                    break;
                }
            }
        }
        System.out.println("No");
    }
}