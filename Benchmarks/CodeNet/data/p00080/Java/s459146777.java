import java.util.Scanner;
import static  java.lang.Math.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double temp = sc.nextDouble();
            if(temp == -1)break;
            double ans = abs(temp/2);
            while(abs(pow(ans,3) - temp)>=0.000001*ans){
            	ans = ans-(pow(ans,3) - temp)/(3*pow(ans,2));
            }
            System.out.printf("%.6f\n", ans);
        }
    }
}