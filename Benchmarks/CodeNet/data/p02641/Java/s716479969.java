import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        //もしゼロだったら答えを返して終わり
        if (n == 0) {
            System.out.println(x);   
            return;
        }
        //nがゼロ以外だったら
        Arrays.sort(array);
        int abs = 100;
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == array[j]) {
                    count++;
                }
            }
            if (count == 0) {
            //数字間の大きさを比較して絶対値を求める
            //もし絶対値が増加したらリターン
            if (i < x) {
                int dif = x - i;
                if (dif < abs) {
                    abs = dif;
                    num = i;
                } 
            } else if (i > x) {
                int dif = i - x;
                if (dif < abs) {
                    abs = dif;
                    num = i;
                } 
            } else {
                System.out.println(x);
                return;
            }
            }
        }
        System.out.println(num);
    }
}
        
        