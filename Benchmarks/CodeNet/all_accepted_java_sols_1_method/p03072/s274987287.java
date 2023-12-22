import java.util.Scanner;

/**
 * @author subaru
 */
public class Main {
    // Great Ocean View
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int maxH = 0;
        for (int i = 0; i < N; i++) {
            int h = sc.nextInt();
            if (maxH > h) {
                continue;
            }
            maxH = h;
            count++;
        }
        System.out.println(count);
    }
}
