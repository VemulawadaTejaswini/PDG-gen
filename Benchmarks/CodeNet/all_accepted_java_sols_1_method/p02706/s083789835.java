import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt();
  	int m=sc.nextInt();
  	int[] nums = new int[m];
  	int sum=0;
  	for(int i=0;i<m;i++){
  		nums[i]=sc.nextInt();
  		sum+= nums[i];
  	}
  	if(n>=sum){
  		System.out.print(n-sum);
  	}else{
  		System.out.print(-1);
  	}
  }
}