import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int snake = Integer.parseInt(sc.next());
        Integer[] sticks = new Integer[n];
        for (int i = 0; i < n; i++) {
            sticks[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(sticks, Comparator.reverseOrder());
        int sum = 0;
        for (int i = 0; i < snake; i++) {
            sum += sticks[i];
        }
        System.out.println(sum);
    }
}
