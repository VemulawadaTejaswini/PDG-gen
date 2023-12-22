import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		int min =0;

		if(n%x==0) {
			min = (n/x)*t;
		}else if(n%x != 0) {
			min = (n/x+1)*t;
		}
		
		System.out.println(min);

	}

}