import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            v[i] = num;
        }
        Arrays.sort(v);
        double total = v[0];
        for(int i = 1; i < n; i++) {
            total = ((total + v[i]) / 2);
        }
        System.out.println(total);
    }
}
