import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        ArrayList<Integer> xx = new ArrayList<>();
        ArrayList<Integer> yy = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            xx.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            yy.add(sc.nextInt());
        }
        xx.add(x);
        yy.add(y);
        int maxX = Collections.max(xx);
        int minY = Collections.min(yy);
        //Collections.sort(xx);
        //Collections.sort(yy);
        if(minY - maxX > 0) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }
}