import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();
        int max = Collections.max(list);
        for (int i = 0; i < k; i++) {
            max *= 2;
        }
        Collections.sort(list);
        max += list.get(0);
        max += list.get(1);
        System.out.println(max);
    }
}