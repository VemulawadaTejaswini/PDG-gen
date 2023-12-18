import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = 1000;
		int c = 0;
		int[] d = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
		} 
		for(int i = 0; i < a- 1; i++){
			if(d[i] < d[i + 1]){
				c += b / d[i];
				b = b % d[i]; 
			}else if(d[i] == d[i + 1]){

			}else{
				b += c * d[i];
				c = 0;
			}
		}
		b += c * d[a - 1];
		System.out.println(b);
		
		
	}
}