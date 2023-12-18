import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0)  break;
            boolean judge = false;
            List<Integer> list = new ArrayList<Integer>();
            long[] temp = new long[4001];
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                long a = sc.nextLong();
                long b = sc.nextLong();
                temp[num] += a * b;
                if (!list.contains(num)) {
                    list.add(num);
                }
 
            }
            for (int i : list) {
                if (temp[i] >= 1000000) {
                    judge = true;
                    System.out.println(i);
                }
            }
            if (!judge)System.out.println("NA");
        }
    }
}