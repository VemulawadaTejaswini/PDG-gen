import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        Set<Integer> nums = new HashSet<Integer>(3) {{
            add(1);
            add(2);
            add(3);
        }};
        nums.remove(a);
        nums.remove(b);
        for (Integer i : nums) {
            System.out.println(i);
            break;
        }
    }
}
