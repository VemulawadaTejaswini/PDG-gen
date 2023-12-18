import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		boolean b = false;
		for(int i = 1; i < 10; i++){
			for(int j = i; j < 10; j++){
				if(i * j == a){
					b = true;
				}
			}
		} 
		if(b){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		
		
	}
}