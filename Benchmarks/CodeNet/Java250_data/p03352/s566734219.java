import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println(1);
        } else {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 2; i <= Math.sqrt(x); i++) {
                int max = 0;
                for (int j = 0; Math.pow(i, j) <= x; j++) {
                    max = (int)Math.pow(i, j);
                }
                list.add(max);
            }
            Collections.sort(list);
            Collections.reverse(list);
            System.out.println(list.get(0));
        }

    }
}