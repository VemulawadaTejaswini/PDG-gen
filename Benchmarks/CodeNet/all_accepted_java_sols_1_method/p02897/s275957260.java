import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double a = sc.nextDouble();
      double b = a;
      if((int)a % 2 != 0){
      	a ++;
      }
		System.out.println((a  / 2) / b);
		
		
	}
}