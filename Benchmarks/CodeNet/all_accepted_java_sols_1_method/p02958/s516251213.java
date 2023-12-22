import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i != list.get(i-1)) {
                count++;
            }
        }

        if (count <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}