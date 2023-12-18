import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        long max, min, sum = 0;
        ArrayList<Integer> z = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            z.add(scan.nextInt());
            sum += z.get(i);
        }
        max = Collections.max(z);
        min = Collections.min(z);

        System.out.printf("%d %d %d \n", min, max, sum);
    }
}