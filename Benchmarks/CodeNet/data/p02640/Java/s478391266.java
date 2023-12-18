import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i <= x; i++) {
            if ((4 * i) + (2 * (x - i)) == y) {
                flag = true;
                break;
            }
        }
        System.out.println(flag?"Yes":"No");
    }

}
