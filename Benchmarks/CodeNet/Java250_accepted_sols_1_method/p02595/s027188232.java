
import java.util.*;

 public class Main {

  
    public static void main(String[] args) {
      Scanner x= new Scanner(System.in);
      int n = x.nextInt();
      int d = x.nextInt();
      double[]nums = new double[n];
      for(int i = 0 ; i < n;i++){
      double a = x.nextDouble();
      double b = x.nextDouble();
      a = Math.pow(a,2);
      b= Math.pow(b,2);
      double c = Math.sqrt(a+b);
      nums[i] = c;
      }
      int count = 0;
          for(int i = 0 ; i<n;i++){
          if(nums[i] <=d){
          count++;
          }
          }
          System.out.println(count);
          
    }
    
}
