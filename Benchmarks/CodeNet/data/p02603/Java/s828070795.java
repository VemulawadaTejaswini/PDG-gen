import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 5;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // 一番高い日に売るが最適
        // 一番高い日までに株数を高くするのが最適
        // 一番高い日までに何株にできますか？問題
        
        // 株数を増やすには安い日に買うのが最適
        
        // 100円
        // 3 2 1 10
        // 100株買える
        // 33株買える
        
        // 「上がる直前で買う、下がる直後で売る」の結果得するならそれをする
        
        boolean hold = true;
        int money = 1000;
        int kabu = 0;
        int last = array[0];
        int old = array[0];
        for (int i = 1; i < n; i++) {
            int now = array[i];
            if (hold) {
                if (old <= now) {
                    old = now;
                } else {
                    int getkabu = money / last;
                    int getmoney = old * getkabu;
                    int remain = money % last;
                    
                    if (getmoney + remain > money) {
                        money = getmoney + remain;
                        last = now;
                        hold = false;
                    } else {
                        hold = false;
                    }
                }
            } else {
                if (last >= now) {
                    last = now;
                } else {
                    hold = true;
                }
            }
            
            // System.out.println(i + " " + money);
        }
        
        if (hold) {
            // System.out.println(123);
            int getkabu = money / last;
            int getmoney = array[n-1] * getkabu;
            int remain = money % last;
            // System.out.println(getkabu);
            // System.out.println(array[n-1]);
            
            if (getmoney + remain > money) {
                money = getmoney + remain;
            }
        }
        
        System.out.println(money);
    }
}
