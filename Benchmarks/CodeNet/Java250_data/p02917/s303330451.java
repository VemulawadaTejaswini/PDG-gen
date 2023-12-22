import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> bList = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            bList.add(sc.nextInt());
        }

        int sum = 0;

        for (int i = 0; i < n - 2; i++) {
            sum += Math.min(bList.get(i), bList.get(i+1));
        }

        sum += bList.get(0) + bList.get(n-2);
        System.out.println(sum);
    }
}