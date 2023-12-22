import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = 0;
        if (a <= 5) {
            ;
        } else if (a < 13) {
            ans += b / 2;
        } else {
            ans += b;
        }
        
        System.out.println(ans);
    }
}