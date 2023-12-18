import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(n:点の個数，d:d以下のものを数える)
		int n = Integer.parseInt(sc.next());
      	int d = Integer.parseInt(sc.next());
      
      	double[] result = new double[n];
      	double tmp = 0;
      	int count = 0;
      
      
      	//距離の計算
      for(int i = 0; i < n; i++){
        tmp = Math.pow(Double.parseDouble(sc.next()), 2) + Math.pow(Double.parseDouble(sc.next()), 2);
    	result[i] = Math.sqrt(tmp);
        //カウント
        if(result[i] <= d){
          count++;
         // System.out.println(result[i]);
        }
      }
  //--------------------------
	//出力
      //System.out.println("n：" + n);
      //System.out.println("d：" + d);
      System.out.println(count);
	}
}

