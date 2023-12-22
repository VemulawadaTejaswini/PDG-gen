import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        boolean ans = true;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i);
            l.add(x);
        }
        for (int i = 1; i < s.length(); i++) {
            if (l.get(i) == l.get(i-1)) {
                ans = false;
            }
        }
        if (ans == true) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}