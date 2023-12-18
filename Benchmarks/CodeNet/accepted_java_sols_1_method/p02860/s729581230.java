import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		String f = sc.next();
		// スペース区切りの整数の入力
		if(a % 2 == 0){
			if(f.substring(0,a / 2).equals(f.substring(a / 2,a))){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}
		
		
		
	}
}