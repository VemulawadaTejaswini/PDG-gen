import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
       int total=1;
      
      for(int i=0;i<n;i++){
     total*=sc.nextInt();
      }

//計算
      if(total>Math.pow(10, 18)){
total=-1;
      }

      
		// 出力
		System.out.println(total);
	}
}