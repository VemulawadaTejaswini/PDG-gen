import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		a --;
		int b = 0;
		for(int i = 1; i < a + 1; i++){
			b += a / i;
		} 
		System.out.println(b);
		
		
	}
}