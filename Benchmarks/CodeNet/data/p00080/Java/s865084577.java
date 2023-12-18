import java.util.*;

public class Main{

    double q;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            q = sc.nextDouble();
            if(q==-1) break;

            double x = q/2.0;
            while((double)Math.abs(x*x*x-q)>=(double)0.00001*q){
                x = x - (x*x*x-q)/(3*x*x);
            }

            System.out.printf("%.6f\n",x);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}