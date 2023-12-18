import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(), H = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), r = sc.nextInt();
        
        if (x <= W-r && x >= r && y <= H-r && y >= r) System.out.println("Yes");
        else System.out.println("No");
    }
}
