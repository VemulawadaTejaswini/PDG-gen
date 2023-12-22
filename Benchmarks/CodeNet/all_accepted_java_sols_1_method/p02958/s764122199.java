import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] list = new Integer[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        Integer[] sorted = Arrays.copyOf(list, n);
        Arrays.sort(sorted);

        String ans = "YES";

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!sorted[i].equals(list[i])) {
                count++;
                if (count > 2) {
                    ans = "NO";
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
