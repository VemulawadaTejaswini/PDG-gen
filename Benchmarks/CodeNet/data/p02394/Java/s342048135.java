
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split(" ");
        int w = Integer.parseInt(ss[0]);
        int h = Integer.parseInt(ss[1]);
        int x = Integer.parseInt(ss[2]);
        int y = Integer.parseInt(ss[3]);
        int r = Integer.parseInt(ss[4]);
        if (x - r < 0 || y - r < 0) {
            System.out.println("No");
            return;
        }
        if (x + r > w || y + r > h) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
