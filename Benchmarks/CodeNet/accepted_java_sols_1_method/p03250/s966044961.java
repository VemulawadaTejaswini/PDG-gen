import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = new int[3];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(a * 10 + b + c);
        list.add(b * 10 + a + c);
        list.add(c * 10 + a + b);
        Collections.sort(list);
        System.out.println(list.get(2));
    }
}