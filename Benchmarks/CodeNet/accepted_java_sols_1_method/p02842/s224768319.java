import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int price = sc.nextInt();
        for(int i = 0;i <= 50000;i++){
          if(price == (int)(i * 1.08)){
            System.out.println(i);
            return;
          }
        }
      System.out.println(":(");
    }
}