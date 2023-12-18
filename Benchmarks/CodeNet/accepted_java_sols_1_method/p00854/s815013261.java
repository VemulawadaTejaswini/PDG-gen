import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                LinkedList<Integer> list = new LinkedList<>();
                for(int i = 1; i <= n; i++) {
                    list.add(i);
                }
                int k = scn.nextInt();
                int m = scn.nextInt() - 1;
                while(list.size() != 1) {
                    list.remove(m);
                    m = (k + m - 1) % list.size();
                }
                System.out.println(list.remove(0));
            }
        }
    }
}