import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        List<Integer> b = new ArrayList(a);

        Collections.sort(b, Collections.reverseOrder());

        for(int i = 0; i < a.size(); i++) {
            if (a.get(i) == b.get(0)) {
                System.out.println(b.get(1));
            } else {
                System.out.println(b.get(0));
            }
        }


    }


}
