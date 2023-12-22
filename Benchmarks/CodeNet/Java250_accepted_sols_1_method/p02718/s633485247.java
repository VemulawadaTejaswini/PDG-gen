import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int n = sn.nextInt();
        int m = sn.nextInt();
        int tmp = 0;
        int cnt = 0;
        int all = 0;
        double num = 0.0;
        double cal = 0.0;
        Integer[] array = new Integer[n];
        
        cal = (double) 1 / (4 * m);
        
        // 各商品の票数を取得し、総督票数を求める
        for(int i = 0; i < n; i++) {
            array[i] = sn.nextInt();
            all += array[i];
        }

        // 人気商品として選択できる最低得票数を求める
        num = (double) (all * cal);
        
        // 
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= num){
                cnt++;
            }
        }
        
        if(cnt >= m) {
            System.out.print("Yes");
            return;
        }
        
        System.out.print("No");
    }
}
