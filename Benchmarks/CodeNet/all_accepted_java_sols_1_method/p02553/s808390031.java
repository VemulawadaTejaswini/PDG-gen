import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        List<Long>str = new ArrayList<>();
        str.add(a*c);
        str.add(a*d);
        str.add(b*c);
        str.add(b*d);
        Collections.sort(str,Collections.reverseOrder());
        System.out.println(str.get(0));
    }
}
