import java.util.*;
class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      
      double[] p= new double[n];
      double max = 0;
      double sum = 0;
      for(int i = 0;i<n;i++){
        p[i] = ((double)(sc.nextInt())/2.0) + 0.5;
      }
      for(int i = 0;i<n;i++){
          sum+=p[i];
          if(i>=k){
            sum-=p[i-k];
          }
          if(sum>max){
            max=sum;          
          }
      }
      System.out.println(max);
    }
}
