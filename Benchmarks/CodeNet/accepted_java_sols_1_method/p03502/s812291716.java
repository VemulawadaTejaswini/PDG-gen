import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int buff = N;
		int sum = 0;
		while(N!=0) {
			sum += N%10;
			N = (int)(N/10);
		}

		if(buff%sum==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}