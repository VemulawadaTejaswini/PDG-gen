import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> prices = new ArrayList<Integer>();
        for(int i=0; i < n; i++){
            prices.add(sc.nextInt());
        }

        Integer total = 0;
        for(int i = 0; i < k; i++){
            Integer min = prices.get(0);
            for(int j = 1; j < prices.size(); j++){
                if(min > prices.get(j)){
                    min = prices.get(j);
                }
            }
            total += min;
            prices.remove(min);
        }
        System.out.println(total);
    }
}
