import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int diff = n - m;
		int sum = 0;
		for(int i=1;i<diff;i++) {
			sum += i;
		}
		
		System.out.println(sum - m);
		
	}

}