import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int T = sc.nextInt();
      int A = sc.nextInt();
      double[] Temp = new double[N];
      
      double min = (double)Integer.MAX_VALUE;
      int minNum = -1;
      
      for(int i=0; i<N; i++){
        double temp = sc.nextDouble();
        if(Math.abs(A - (T - temp*0.006)) < min) {
			min = Math.abs(A - (T - temp*0.006));
            minNum = i+1;               
        }  
      }  
      System.out.println(minNum);
    }  
} 