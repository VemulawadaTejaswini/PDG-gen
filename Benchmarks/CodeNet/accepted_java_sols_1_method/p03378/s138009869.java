import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++){
            int k = in.nextInt();
            list.add(k);
        }
        int cost_left = 0;
        for (int i = x; i >= 0; i--){
            if (list.contains(i)) cost_left++;
        }
        int cost_rigth = 0;
        for (int i = x; i <= n; i++){
            if (list.contains(i)) cost_rigth++;
        }
        System.out.println(Math.min(cost_left, cost_rigth));
    }

}