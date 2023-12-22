
import java.util.*;

/**
 * B
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> name_array = new ArrayDeque<String>();
        Queue<Integer> time_array = new ArrayDeque<Integer>();

        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int sum_time = 0;

        for (int i = 0; i < n; i++) {
            name_array.add(sc.next());
            time_array.add(sc.nextInt());
        }

        sc.close();

        while (name_array.peek() != null) {

            String str = name_array.remove();
            int tmp = time_array.remove();

            if(tmp > q) {
                name_array.add(str);
                time_array.add(tmp - q);
                sum_time += q;
            } else {
                System.out.println(str + " " + (sum_time + tmp));
                sum_time += tmp;
            }

        }
    }
}
