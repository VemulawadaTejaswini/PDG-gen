import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i);
            l.add(x);
        }
        Collections.sort(l);
        if (l.get(0) == l.get(1) && l.get(2) == l.get(3) && l.get(0) != l.get(3)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
