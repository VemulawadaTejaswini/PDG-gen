import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        Collections.reverse(list);
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) a += list.get(i);
            else b += list.get(i);
        }
        System.out.println(a - b);
    }
}