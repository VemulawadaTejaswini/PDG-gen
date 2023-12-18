import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int e = Integer.parseInt(sc.next());
        int f = Integer.parseInt(sc.next());
        Set<Integer> setX = new TreeSet<>();
        Set<Integer> setY = new TreeSet<>();
        for (int i = 0; i <= f / (a * 100); i++) {
            for (int j = 0; j <= f / (b * 100); j++) {
                int temp = a * 100 * i + b * 100 * j;
                if (temp > 0 && temp <= f) {
                    setX.add(temp);
                }
            }
        }
        for (int i = 0; i <= f / c; i++) {
            for (int j = 0; j <= f / d; j++) {
                int temp = c * i + d * j;
                if (temp <= f) {
                    setY.add(temp);
                }
            }
        }
        double ans = 0;
        double temp = 0;
        int ansx = 0;
        int ansy = 0;
        for (int x : setX) {
            for (int y : setY) {
                temp = y * 1.0 / (x + y);
                if (temp <= (e / (e + 100.0)) && ans <= temp && x + y <= f) {
                    ans = temp;
                    ansx = x;
                    ansy = y;
                }
            }
        }
        System.out.println(ansx + ansy + " " + ansy);
    }
}