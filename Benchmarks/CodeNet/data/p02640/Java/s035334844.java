import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (y%2==1) {
            System.out.println("No");
            return;
        }
        int min = x*2;
        int max = x*4;
        if (y>=min && y<=max) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
