import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            c.add(sc.nextInt());
        }        
        for (int query = 0; query < q; query++) {
            Integer start = sc.nextInt();
            Integer end = sc.nextInt();
            ArrayList<Integer> count = new ArrayList<Integer>();
            for (int i = start - 1; i < end; i++) {
                Integer color = c.get(i);
                if (!count.contains(color)) {
                    count.add(color);
                }
            }
            System.out.println(count.size());
        }
        sc.close();
    }
}
