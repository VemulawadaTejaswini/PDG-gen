import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = Integer.parseInt(sc.next());
		
    /*--------------------------------*/
    //入力
    //int k = 101;

      
    //数列の定義
    int i=0;
    double sum = 0;
    while(i <= 1000000){
      sum = sum + 7 * Math.pow(10,i);
      //sum = sum + 1 * Math.pow(10,i);	//数列の定義
      //System.out.println(sum);
      // 出力
      if((int)sum%k == 0){
          System.out.println(i+1);
          break;
      }
      i++;
    }
     if(i > 1000000){
       System.out.println("-1");
     }

}
}

