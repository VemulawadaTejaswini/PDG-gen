import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int sum = 0;
            ArrayList<Integer> s = new ArrayList<>();
            for (int i=0; i<n; ++i) {
                s.add(sc.nextInt());
                sum += s.get(i);
            }
            sum -= Collections.max(s);
            sum -= Collections.min(s);

            System.out.println((int)(sum / (n-2)));
        }
        sc.close();
    }
}

