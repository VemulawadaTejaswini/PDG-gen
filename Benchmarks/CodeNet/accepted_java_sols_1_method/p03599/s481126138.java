import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();
        for (int i = 0; 100 * a * i <= f; i++) {
            for (int j = 0; ; j++) {
                int sum = 100 * a * i + 100 * b * j;
                if (sum > f) {
                    break;
                } else {
                    x.add(sum);
                }
            }
        }
        for (int i = 0; c * i <= f; i++) {
            for (int j = 0; ; j++) {
                int sum = c * i + d * j;
                if (sum > f) {
                    break;
                } else {
                    y.add(sum);
                }
            }
        }
        x.removeIf(h->{return h == 0;});
        int sw = 0;
        int su = 0;
        double no = 0;
        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < y.size(); j++) {
                if (x.get(i) + y.get(j) <= f && y.get(j) * 100 / (double)x.get(i) >= no && y.get(j) * 100 / (double)x.get(i) <= e) {
                    no = y.get(j) * 100 / (double)x.get(i);
                    sw = x.get(i) + y.get(j);
                    su = y.get(j);
                }
            }
        }
        System.out.println(sw + " " + su);
    }
}
