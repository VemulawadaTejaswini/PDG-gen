import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt(), H = scan.nextInt(), x = scan.nextInt(), y = scan.nextInt(), r = scan.nextInt();
        x += r;
        y += r;
        
        boolean a = W < x && H < y;
        if (a) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}