
import java.util.*;


public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();


        Integer min = INF;
        List<Integer> list = new ArrayList<Integer>();
        for (int tmp = 1; tmp <= n ; tmp++) {
            Integer a = tmp + l - 1;
            list.add(a);
            if(Math.abs(min) > Math.abs(a)){
                min = a;
            }
        }
        list.remove(min);
        int result = list.stream().mapToInt(s -> s).sum();
        System.out.println(result);

    }
}
