import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((y-2*x) >= 0 && (y-2*x)%2 == 0 && (4*x-y) >= 0 && (4*x-y)%2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}