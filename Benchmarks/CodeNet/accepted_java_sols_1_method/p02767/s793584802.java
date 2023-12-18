import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        int max = Collections.max(list);
        int min = Collections.min(list);
        long ans = Long.MAX_VALUE;
        for(int i=min; i<=max; i++) {
            long total = 0;
            for(int j=0; j<list.size(); j++) {
                total += Math.pow(list.get(j) - i, 2);
            }
            if(total < ans) ans = total;
        }
        System.out.println(ans);
    }
}