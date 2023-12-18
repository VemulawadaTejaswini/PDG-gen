import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		if(n%k == 0){
			System.out.println(0);
		}else{
		System.out.println(1); 
		}
	}
}