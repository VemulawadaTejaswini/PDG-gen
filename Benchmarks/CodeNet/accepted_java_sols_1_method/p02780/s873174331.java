import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double P [] = new double[N];
        double max = 0,now =0;
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            double sum = 0;
            for(int j=1;j<=num;j++) sum+=j;
            sum/=num;
            P[i] = sum;
            if(i<K) {
                max+=sum;
                now+=sum;
            }
            else{
                now = now -P[i-K]+P[i];
                if(now>max) max=now;
            }
        }
        System.out.println(max);
    }
}