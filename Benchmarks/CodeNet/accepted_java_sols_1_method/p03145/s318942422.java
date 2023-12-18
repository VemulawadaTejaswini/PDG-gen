import java.util.*;
class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
 
      // スペース区切りの整数の入力
      int ab = sc.nextInt();
      int bc = sc.nextInt();

      //三角形の面積計算
      int area = ab * bc / 2;
      
      //面積を出力
      System.out.println(area);
	}
}