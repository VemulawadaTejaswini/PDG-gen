import java.util.*;

public class Main{
    class Card{
        int a;
        int b;
        Card(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int[] card_num = new int[101];
            int m = sc.nextInt();
            if(m==0){
                break;
            }
            Card[] cards = new Card[m];
            for(int i = 0; i < m; i++){
                cards[i] = new Card(sc.nextInt(), sc.nextInt());
            }
            int ub = 7*100*10;
            int[] dp = new int[ub];
            dp[0] = 1;
            for(int i = 0; i < m; i++){
                for(int ii = 7 * 100 * 10 - cards[i].a -1; ii >= 0; ii--){
                    for(int iii = 1; iii <= cards[i].b; iii++){
                        if(ii + cards[i].a*iii < ub-1){
                            dp[ii + cards[i].a*iii] += dp[ii];
                        }
                    }
                }
            }
            /*
              System.out.println(Arrays.toString(dp));
              for(int i = 0; i < 100; i++){
              System.out.println(i + " : " + dp[i]);
              }
            */
            int g = sc.nextInt();
            for(int i = 0; i < g; i++){
                System.out.println(dp[sc.nextInt()]);
            }
        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}