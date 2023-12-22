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
        Collections.sort(list);
        double total = (list.get(0) + list.get(1)) / 2.0;
        for(int i=2; i<n; i++) {
            total = (list.get(i) + total) / 2.0;
        }
        System.out.println(total);
    }
}