import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        long sum = 0;
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long l = sc.nextLong();
            list.add(l);
            sum += l;
        }
        
        Collections.sort(list);
        
        System.out.println(list.get(0) + " " + list.get(n-1) + " " + sum);
    }
}