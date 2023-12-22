import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) g.add(a);
        }

        String result = "APPROVED";
        for (int b : g) {
            if (b % 3 != 0 && b % 5 != 0) {
                result = "DENIED";
                break;
            }
        }

        System.out.println(result);
    }
}