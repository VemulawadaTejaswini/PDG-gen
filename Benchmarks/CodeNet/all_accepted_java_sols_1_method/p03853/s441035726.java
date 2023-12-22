import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] img = new String[h];

        for (int i = 0; i < h; i++) {
            img[i] = sc.next();
        }

        for (int i = 0; i < h; i++) {
            System.out.println(img[i]);
            System.out.println(img[i]);
        }
    }
}
