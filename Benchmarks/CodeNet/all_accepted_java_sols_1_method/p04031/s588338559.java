import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
            set.add(a.get(i));
        }
        if(set.size() == 1) {
            System.out.println(0);
            return;
        }
        int max = Collections.max(a);
        int min = Collections.min(a);
        //Collections.sort(a);
        int ans = Integer.MAX_VALUE;
        for (int i = min; i <= max; i++) {
            int sum = 0;
            for (int b : a) {
                if(i != b) {
                    sum += Math.pow(b - i, 2);
                }
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}