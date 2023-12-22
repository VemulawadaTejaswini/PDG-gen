import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = a;
		String f = sc.next();
		for(int i = 0; i < a - 1; i++){
			if(f.substring(i, i + 1).equals(f.substring(i + 1, i + 2))){
				b --;
			}
		} 
		System.out.println(b);
		
		
	}
}