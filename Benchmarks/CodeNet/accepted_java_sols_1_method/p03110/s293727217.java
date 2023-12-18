import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int n = sc.nextInt();
		double sum = 0;
		
		for(int i=0;i<n;i++){
		    double x = Double.parseDouble(sc.next());
		    String u = sc.next();
		    if(u.equals("JPY")){
		    	sum +=x;
		    }else{
		    	sum +=x*380000;
		    }

		}


        System.out.println(sum);
 
	}
}
