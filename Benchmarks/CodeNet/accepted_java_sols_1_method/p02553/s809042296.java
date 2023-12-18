import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        ArrayList<Long> list = new ArrayList<>();
        list.add(a * c);
        list.add(a * d);
        list.add(b * c);
        list.add(b * d);
        System.out.println(Collections.max(list));
    }
}