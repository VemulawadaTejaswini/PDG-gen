import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int x = a * 800;
		int y = (a / 15) * 200 ;
		System.out.println(x-y);
	}
}