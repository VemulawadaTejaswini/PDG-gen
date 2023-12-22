import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		
		// 計算
		double result = 0;
		
		if(x <= a*a*b/2){
		    double t = (a*b*b)/(2*x);
		    result = atan(t)*180/Math.PI;
		}else{
		    double t = (2*a*a*b - 2*x)/(a*a*a);
		    result = atan(t)*180/Math.PI;
		}
		
		// 出力
		System.out.println(result);
		
	}
}