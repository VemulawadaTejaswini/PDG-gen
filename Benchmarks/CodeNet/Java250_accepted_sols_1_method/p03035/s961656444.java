import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
      
		if (0<=A&&A<=5){
           B = 0;
          System.out.print(B);
        }else if (6<=A && A<=12){
           B = B/2;
          System.out.print(B);
        }else if (13<=A && A<=100){
          System.out.print(B);
        }
		// 出力
		
	}
}
