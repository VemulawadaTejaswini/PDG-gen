import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        for(int i=0; i<n; i++) {
            p.add(sc.nextInt());
        }
        Collections.sort(p);
        int total = 0;
        for(int i=0; i<k; i++) {
            total += p.get(i);
        }
        System.out.println(total);
    }
}