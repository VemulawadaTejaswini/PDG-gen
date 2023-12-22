import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	double N = sc.nextDouble();
      	double X = sc.nextDouble();
      	int T = sc.nextInt();
      	int res = (int)(Math.ceil(N/X));
      	
      	System.out.println(res*T);
    }
}