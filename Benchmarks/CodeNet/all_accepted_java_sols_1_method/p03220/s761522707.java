import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = sc.nextInt();
        double a = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        int plan = 0;
        double sub = 0.0;
        double temp = 0;
        double minsub = 100000.0;
        for(int i = 0; i < n; i++){
            temp =  t - h[i] * 0.006;
            sub = Math.abs(a - temp);
            if(sub < minsub){
                minsub = sub;
                plan = i+1;
            }
        }
        System.out.print(plan);
    }
}