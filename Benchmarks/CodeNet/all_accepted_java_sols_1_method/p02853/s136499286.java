import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int res = 0;
        if(x <= 3) {
            res += 100000 * (4-x);
        }
        if(y <= 3) {
            res += 100000 * (4-y);
        }
        if(x == 1 && y == 1) {
            res += 400000;
        }
        System.out.println(res);

    }
}
