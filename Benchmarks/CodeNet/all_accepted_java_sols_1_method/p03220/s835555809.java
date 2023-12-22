import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double T = (double)sc.nextInt();
        double A = (double)sc.nextInt();
        double min = 100000000;
        int ans = 0;
        for(int i = 0;i < N;i++){
            double d = Math.abs(A-T+(double)sc.nextInt()*0.006);
            if(d < min){
                min = d;
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}