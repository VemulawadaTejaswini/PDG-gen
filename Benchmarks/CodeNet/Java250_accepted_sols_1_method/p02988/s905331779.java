
import java.util.*;


public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int tmp = 0; tmp< n; tmp++){
            int a = sc.nextInt();
            list.add(a);
        }
        int result = 0;

        for(int tmp = 1; tmp<n -1; tmp++){
            int pm = list.get(tmp - 1);
            int p = list.get(tmp);
            int ph = list.get(tmp + 1);

            if((pm < p && p<ph) || (pm >p && p>ph)){

                    result++;
            }
        }

        System.out.println(result);



    }
}
