import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for(long i=0; i<n; i++) {
            list.add(sc.nextLong());
        }
        if(n <= k) {
            System.out.println(0);
            return;
        }
        Collections.sort(list);
        long total = 0;
        for(int i = n; i >= 0; i--, k--) {
            if(k >= 0) continue;
            total += list.get(i);
        }
        System.out.println(total);
    }
}