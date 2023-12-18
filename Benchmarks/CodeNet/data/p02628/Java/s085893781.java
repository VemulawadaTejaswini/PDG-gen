import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> prices = new ArrayList<>();

        for(int i=0; i<n; i++){
            prices.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(prices);

        int sum =0;
        for(int i=0; i<k; i++){
            sum += prices.get(i);
        }
        System.out.println(sum);
    }
}