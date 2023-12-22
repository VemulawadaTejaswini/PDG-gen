import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double k = sc.nextInt();
        double ans[] = new double[(int)n+1];
        for(int i=1; i<=(int)n; i++){
            double temp = (double)i;
            int memo = 0;
            while(true){
                
                if(temp > k-1){
                    break;
                }
                temp*=2;
                memo++;
            }
            ans[i] = 1/n * pow(0.5, memo);
        }
        double res = 0;
        for(int i =1; i<=(int)n; i++){
            res += ans[i]; 
        }
        System.out.println(res);

    }
}