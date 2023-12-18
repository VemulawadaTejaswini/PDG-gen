import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] boxes = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            boxes[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] contents = new int[n + 1];
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int apple = sc.nextInt();
            int count = sc.nextInt();
            if (type == 1) {
                contents[apple] += count;
                if (contents[apple] > boxes[apple]) {
                    System.out.println(apple);
                    return;
                }
            } else if (type == 2) {
                contents[apple] -= count;
                if (contents[apple] < 0) {
                    System.out.println(apple);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}

