import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int a, b;
        a = x + r;
        b = y + r;
        if(a < W && b < H) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
