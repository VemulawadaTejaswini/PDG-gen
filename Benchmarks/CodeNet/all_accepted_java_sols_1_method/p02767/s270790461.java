import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n;
        n = cin.nextInt();

        ArrayList<Integer> x  = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            x.add(cin.nextInt());
        }

        int xSquareMin = 1000000000;

        for (int i = 0; i < 101; i ++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += (x.get(j) - i) * (x.get(j) - i);
            }
            if (sum < xSquareMin) {
                xSquareMin = sum;
            }
        }
        System.out.println(xSquareMin);
    }
}
