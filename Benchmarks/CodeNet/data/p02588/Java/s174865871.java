import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
 		double[] array = new double[n];
      
      int count=0;
      
      for(int i=0;i<n;i++){
      	array[i] = sc.nextDouble();
      }
      
	  for(int i=0;i<n;i++){
      	for(int j=i+1;j<n;j++){
          
          double seki = array[i]*array[j];
          int sekiInt = (int)seki;
          
          if(seki/(double)sekiInt==1 && seki%(double)sekiInt==0){
                     // System.out.println(array[i]+","+array[j]+":double:"+seki);
       			   //System.out.println("int:"+sekiInt);
          	count ++;
          }
        }
      }
		// 出力
		System.out.println(count);
	}
}