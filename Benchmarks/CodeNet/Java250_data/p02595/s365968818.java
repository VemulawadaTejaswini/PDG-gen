import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double D = sc.nextDouble();
        double[] list = new double[N*2];
      
        for(int i = 0; i < N*2; i++){
          list[i] = sc.nextDouble();
        }
       
        int count = 0;
        for(int i = 1; i < N*2; i+=2){
          double x = list[i-1];
          double y = list[i];
          double ans = x*x + y*y;
          double answer = Math.sqrt(ans);
         
           if(answer <= D){
             count++;
           }
        }
  
          System.out.println(count);
        
	}

}