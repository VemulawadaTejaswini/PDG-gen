import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3000; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0) {
                return;
            }
            if(x > y) {
                System.out.println(y + " " + x);
            } else {
                System.out.println(x + " " + y);
            }
        }
    }
}
