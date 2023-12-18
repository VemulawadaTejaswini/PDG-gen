import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		if( a % 1000 != 0){
			System.out.println(1000 - (a % 1000));
		}else{
			System.out.println(0);
	
		}
		}
}