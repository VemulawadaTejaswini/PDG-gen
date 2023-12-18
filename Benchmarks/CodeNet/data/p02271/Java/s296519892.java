import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int total = 0;
    static int list[];

    static Boolean check[];

    public static void main(String[] args) {
        check = new Boolean[2000 + 1];
        Scanner inp = new Scanner(System.in);

        total = inp.nextInt();
        list = new int[total];

        for (int k = 0; k < total; k++) {
            int item = inp.nextInt();
            list[k] = item;
        }

        solve(0, 0);
        int n;

        int num = inp.nextInt();
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < num; i++) {
            n = inp.nextInt();

            if (check[n] != null && check[n]) {
                s.append("yes");
            } else {
                s.append("no");
            }

            if (i != num-1) {
                s.append("\n");
            }
        }

        System.out.println(s);
    }

    public static void solve(int place, int sum) {
        if (place == total) {
            check[sum] = true;
            return;
        }

        int u = list[place];

        solve(place+1, sum);

        if (sum+u <= 2000) {
            solve(place+1, sum+u);
        }
    }
}

