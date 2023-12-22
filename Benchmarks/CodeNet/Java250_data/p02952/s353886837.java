import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;

		//　桁数が奇数の数を数える
		for(int i = 1; i <= n; i++) {
			if(Integer.toString(i).length() % 2 == 1) {
				res++;
			}
		}
		
		System.out.println(res);
		sc.close();
	}
}