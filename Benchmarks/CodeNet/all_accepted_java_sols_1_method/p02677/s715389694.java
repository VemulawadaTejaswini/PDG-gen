import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();
        double kaku = 0;
        double ans;
        kaku = ((h + m / 60) * 30 ) - m * 6;
        if(kaku > 180){
         kaku = 360 - kaku; 
        }
        
        ans = a * a + b * b - 2 * a * b * Math.cos(kaku*(Math.PI/180));
        ans = Math.sqrt(ans);
        
      	System.out.println(ans);
 
    }
}