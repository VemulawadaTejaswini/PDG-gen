
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 個数
        int n = sc.nextInt();
      
      	//それぞれの数字
      	long[] a= new long[n];
      
      	long result=0;
      	long sum=0;
      	long sqSum=0;
		
      	for(int i=0;i<n;i++){
          a[i]=sc.nextLong();
          sum=(sum+a[i])%(long)(2*Math.pow(10,9)+14);
          sqSum=(sqSum+a[i]*a[i])%(long)(2*Math.pow(10,9)+14);
        }
      	
      	result=((sum*sum-sqSum)/2) % (long)(Math.pow(10,9)+7);
      	

      	System.out.println(result);
      
      
      
      
    }
}