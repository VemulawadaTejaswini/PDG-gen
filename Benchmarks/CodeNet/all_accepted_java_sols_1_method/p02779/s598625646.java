
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set s = new HashSet<Integer>();

        int n = sc.nextInt();

        boolean out = false;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            Integer e = new Integer(a);
            if (s.contains(e)) {
                System.out.println("NO");
                out = true;
                break;
            } else {
                s.add(e);
            }
        }

        if (!out) {
            System.out.println("YES");
        }
    }
}