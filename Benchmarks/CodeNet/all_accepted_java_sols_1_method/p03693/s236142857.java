import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int g = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int target = 100 * r + 10 * g + b;
        if (target % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
