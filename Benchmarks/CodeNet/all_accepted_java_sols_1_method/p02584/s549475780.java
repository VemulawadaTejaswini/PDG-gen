import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      long X = scan.nextLong();//初期座標
      long K = scan.nextLong();//移動する回数
      long D = scan.nextLong();//一回で移動する距離
      
      X = Math.abs(X);
      long straight = Math.min(K,X / D);
      long Y = X - (straight * D);
      K -= straight;
      
      if(K > 0)
        if(K % 2 == 1)
          Y = Math.abs(Y - D);
       
      System.out.println(Y);
    }
}