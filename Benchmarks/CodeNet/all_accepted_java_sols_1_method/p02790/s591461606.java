import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt(); // 合計値
      int S = sc.nextInt();

      StringBuilder val = new StringBuilder();
      for(int count = 0; count < S; count++) {
          String cntval = Integer.toString(N);
          val.append(cntval);
      }
      String NN = new String(val);
      StringBuilder val2 = new StringBuilder();
      for(int count = 0; count < N; count++) {
          String cntval = Integer.toString(S);
          val2.append(cntval);
      }
      String SS = new String(val2);
      
      if(NN.compareTo(SS) > 0){
      	System.out.println(SS);
      } else {
      	System.out.println(NN);
      }
   }
}
