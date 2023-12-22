import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // KEYENCE-A - Painting

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        int x = h > w ? h : w;
        
        int cnt = n / x;
        
        if (n % x > 0) cnt++;
        
        
        System.out.println(cnt);
    }
}