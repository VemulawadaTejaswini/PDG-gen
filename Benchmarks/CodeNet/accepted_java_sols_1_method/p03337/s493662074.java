import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();

		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		a1 = a + b;
		a2 = a * b;
		a3 = a - b;
		
		
		if(a1 > a2){
			if(a1 > a3){
				System.out.println(a1);
			}else{
				System.out.println(a3);
			}
		}else {
			if(a2 > a3){
				System.out.println(a2);
			}else{
				System.out.println(a3);
			}
		}
	}
}