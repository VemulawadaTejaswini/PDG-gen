import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int cnt = 0;
        for (int i = 1; i <= 4; i++) {
            if (n % 10 == 2)
                cnt++;
            n /= 10;
        }
        System.out.print(cnt);
    }
}
