import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int BuyNum = sc.nextInt();
        int ans = 0;
        int[] price = new int[num];
        for (int i = 0; i < num; i++){
            price[i] = sc.nextInt();
        }
      	Arrays.sort(price);
        for (int i = 0; i < BuyNum; i++) {
            ans += price[i];
        }
        System.out.println(ans);
    }
}
