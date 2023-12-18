import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            h.add(sc.nextInt());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int target = h.get(i);
            boolean canSee = true;
            if (i == 0) {
                count++;
                continue;
            }
            for (int j = 0; j < i; j++) {
                int height = h.get(j);
                if (target < height) {
                    canSee = false;
                    break;
                }
            }
            if (canSee) {
                count++;
            }
        }
        System.out.println(count);
    }

}
