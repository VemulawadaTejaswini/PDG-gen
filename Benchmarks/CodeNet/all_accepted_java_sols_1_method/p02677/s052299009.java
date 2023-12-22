import java.util.Scanner;
import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      //数字の数を入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
      //短針が進む角度
      double tanshin = 0.5 *m + 30*h;
      //長針
      double tyoshin = 6 * m;
      //なす角度
      double kakudo = tanshin - tyoshin;

        if(kakudo > 180){
        	kakudo = 360 - kakudo;
      	}
        if(kakudo < 0){
        	kakudo *= -1;
        }
        
      	double result2 = a*a + b*b - 2*a*b* Math.cos(Math.toRadians(kakudo));
      	double result = Math.sqrt(result2);
      	System.out.println(result);
      
      }             
      
	}

