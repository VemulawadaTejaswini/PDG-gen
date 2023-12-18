import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        sc.close();

        list.sort(Comparator.reverseOrder());

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}