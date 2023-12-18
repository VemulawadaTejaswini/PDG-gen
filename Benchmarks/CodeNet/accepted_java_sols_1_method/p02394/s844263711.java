import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        boolean WOK = x - r >= 0 && x + r <= W;
        boolean HOK = y - r >= 0 && y + r <= H;

        System.out.println(WOK && HOK ? "Yes" : "No");
        sc.close();
    }
}

