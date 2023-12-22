import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt() - i;
            map.put(b[i], map.getOrDefault(b[i], 0) + 1);
        }
        long res = 0;
        for(int i=0; i<n; i++) {
            map.put(b[i], map.get(b[i]) - 1);
            res += map.getOrDefault(-2 * i - b[i], 0);
        }
        System.out.println(res);

    }

}