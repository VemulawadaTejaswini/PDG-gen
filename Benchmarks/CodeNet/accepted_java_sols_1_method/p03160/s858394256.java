import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int[] H = new int[N];
	  for(int i=0; i<N; i++) {
		  H[i] = sc.nextInt();
	  }
	 int[] DP = new int[N];
	 DP[0] = 0; DP[1] = H[1] - H[0];  if(DP[1]< 0) DP[1]= -DP[1];
	 
	 for(int i = 2; i< N; i++) {
		 int oneD = Math.abs(H[i] - H[i - 1]); 
		 int twoD = Math.abs(H[i] - H[i - 2]); 
		 int oneStep = DP[i-1] + oneD;
		 int twoStep = DP[i-2] + twoD;
		 //現在の地点までの最短距離= 直前の地点までの最短距離（DP）+その地点から現在の地点までの移動距離

		 //候補が２つしかないから1行で済んでるが、比較対象が多数にわたる場合は・・・
		 int dp = oneStep > twoStep ? twoStep: oneStep;
		 DP[i] = dp;	
	 }
	out.println(DP[N - 1]);
  }
}