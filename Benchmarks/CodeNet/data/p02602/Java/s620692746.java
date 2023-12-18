import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        sc.close();
        
        ArrayList<Integer> points = new ArrayList<Integer>();
        for (int i = k; i <= n; i++) {
            Integer point = 1;
            for (int j = i - k; j < i; j++) {
                point *= a.get(j);
            }
            points.add(point);
        }

        for (int i = 0; i < points.size() - 1; i++) {
            if (points.get(i) < points.get(i + 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
