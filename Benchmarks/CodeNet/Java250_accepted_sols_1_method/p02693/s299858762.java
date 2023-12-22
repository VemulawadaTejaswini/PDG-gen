import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = sc.nextInt();
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        int r = 0;
		// 判定
		for(int i = a; i <= b; i ++){
			if(i % k == 0){
				System.out.print("OK");
				r = 1;
				break;
			}
		}
		if(r == 0){
            System.out.print("NG");
		}
	}
}