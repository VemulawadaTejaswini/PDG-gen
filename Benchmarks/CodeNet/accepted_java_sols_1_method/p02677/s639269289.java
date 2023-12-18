import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M =sc.nextInt();
        
      double minute = H*60 + M ;    
      double angle = minute * 5.5;
      double radian =Math.PI * angle /180.0;
      double distance = Math.sqrt( A*A + B*B -2.0*A*B*Math.cos(radian));
      System.out.println(distance);
	}
  
      
}