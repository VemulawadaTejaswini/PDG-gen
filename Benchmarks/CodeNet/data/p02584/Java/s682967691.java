import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x_k_d [] = s.split(" ", -1);
        long x = Long.parseLong(x_k_d[0]);
        long k = Long.parseLong(x_k_d[1]);
        long d = Long.parseLong(x_k_d[2]);
        
        //移動した後の位置pos、残り移動回数a
        long pos = x;
        long a = k;
        long b = 0;
        long c = 0;

        //出力は絶対値なのでposを正にして計算する
        if(x < 0){
            pos *= -1;
        }
        //0に近づけるように移動させる
        if(x / d < k){
            pos = x % d;
            a -= x / d;
        }else{
            pos -= d * k;
            a = 0;
        }
        
        if(a == 0){
            System.out.println(pos);
        }else{
            b = pos;
            c = (pos - d) * -1;
            if(a % 2 == 0){
                System.out.println(b);
            }else if(a % 2 == 1){
                System.out.println(c);
            }
        }
    }
}