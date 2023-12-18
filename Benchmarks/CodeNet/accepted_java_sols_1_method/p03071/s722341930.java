import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		// スペース区切りの整数の入力
		int B = sc.nextInt();
      int sum=0;
      // 出力
      for(int cnt=0;cnt<2;cnt++){
      if(A<=B){
          sum+=B;
        B--;
        }else{
        sum+=A;
        A--;
      	}    
      }
		System.out.println(sum);
	}
}