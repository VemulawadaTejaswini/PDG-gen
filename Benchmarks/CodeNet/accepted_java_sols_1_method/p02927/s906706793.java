import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d1, d10;
		int cnt = 0;
		for(int i = 1; i <= a; i++){
			for(int j = 1; j <= b; j++){
				d1 = j%10;
				d10 = j/10;
				if(d1 >= 2 && d10 >= 2 && i ==  d1 * d10){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
