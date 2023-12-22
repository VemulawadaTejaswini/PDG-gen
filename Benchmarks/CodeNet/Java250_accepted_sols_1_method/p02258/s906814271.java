import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(sc.nextInt());
        }
        sc.close();
        
        int min = data.get(0);
        int max = data.get(0);
        int ans = Integer.MIN_VALUE;
        int min_profit = Integer.MIN_VALUE;
        int count = 0;
        for (int num : data) {
            if (min > num) {
                min = num;

                if (min_profit <  min - max) {
                    min_profit = min - max;
                    max = min;
                } else {
                    max = Integer.MIN_VALUE;
                }
            } else if (count > 0 && max <= num) {
                max = num;
                if (ans < max - min)
                    ans = max - min;
            }
            count++;
       }
        System.out.println(ans > min_profit ? ans : min_profit);
    }
}
