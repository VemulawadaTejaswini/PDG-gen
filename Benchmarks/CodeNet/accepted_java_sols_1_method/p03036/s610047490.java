import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int w = sc.nextInt();

        int last = w;
        for (int i = 1; i <= 10; i++) {
            last = r * last - D;
            System.out.println(last);
        }
    }
}