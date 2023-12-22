
import java.util.*;


public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Long> list = new ArrayList<>();
        for(int tmp = 0; tmp< n; tmp++){
            long a = sc.nextInt();
            list.add(a);
        }
        Collections.sort(list);

        long halfl = list.get(n/2-1);
        long halfh = list.get(n/2);

        long result = halfh - halfl;

        System.out.println(result);



    }
}
