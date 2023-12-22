import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int L=sc.nextInt();
      int sum=0;
      for(int i=1;i<N+1;i++){
        sum+=i+L-1;
      }
      if(L>=0){
      sum-=L;
      }else if(N>Math.abs(L)){
        sum=sum;
      }else{
      sum+=Math.abs(N+L-1);
      }
      System.out.println(sum);
	}
}