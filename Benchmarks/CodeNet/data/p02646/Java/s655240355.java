import java.util.Scanner;
import java.lang.*;

public class Main{
 
	public static void main(String args[]){

    	//入力するためのオブジェクトを生成
      	Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();	//Aのいる座標
	int V = scan.nextInt();	//Aの秒速
	int B = scan.nextInt(); //Bがいる座標
	int W = scan.nextInt();	//Bの秒速

	int T = scan.nextInt(); //秒数
	


	//AとBの位置関係により進む方向を場合分けする
	if(A < B){ // ABの順でならんでいるとき
	   if(A +( V * T) < B + (W * T) ){
	      System.out.println("No");
	   }else if(A +( V * T) >= B + (W * T)){
	      System.out.println("Yes");
	   }
	 }else if(B < A){ //BAの順で並んでいる時
	   if(B -(W * T) >= A -(V * T) ){
	      System.out.println("Yes");
	   }else{
	      System.out.println("No");
           }

	
	}

	

   }
}