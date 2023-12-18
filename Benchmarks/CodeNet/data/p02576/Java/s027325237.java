import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();

        //試行回数
        int l;

        //割り切れるとき
        if(N % X == 0){
            l = N / X;
        }
        else{
            l = N / X + 1;
        }

        int a = l * T;
        System.out.println(a);
    }
}