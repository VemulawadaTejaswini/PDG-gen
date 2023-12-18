import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int c = 0;
		int[] d = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
		} 
		for(int i = 0; i < a; i+=2){
			if(d[i] % 2 == 1){
				c ++;
			}
		}
		System.out.println(c);
		
		
	}
}