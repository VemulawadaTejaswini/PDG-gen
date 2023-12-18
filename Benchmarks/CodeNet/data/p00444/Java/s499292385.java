import java.util.*;
public class Main{
    void run(){
        Scanner sc = new Scanner(System.in);
        int[] coins = { 500, 100, 50, 10, 5, 1};
        while(true){
            int price = sc.nextInt();
            if(price == 0){
                break;
            }
            int change = 1000 - price;
            int ans = 0;
            for(int c: coins){
                while(change >= c){
                    change -= c;
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}