import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();//種類数
		int b = sc.nextInt();//買う数
		
		int[] c = new int[a];
		
		for(int i = 0; i < a; i++) {
			c[i] = sc.nextInt();
		}
		
		Arrays.sort(c);
		
		int d = 0;
		
		for(int i = 0; i < b; i++) {
			d += c[i];
		}
		System.out.println(d);
	}
}