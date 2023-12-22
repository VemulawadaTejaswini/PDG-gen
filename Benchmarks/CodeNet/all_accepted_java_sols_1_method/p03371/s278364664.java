import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int mai;
		int nokori;
		if(d>=e) {
			mai = e;
			nokori = d-e;
		}else {
			mai = d;
			nokori = e-d;
		}

		int money = 0;

		if(a+b > 2*c) {
			money = 2*c*mai;
			if(d>=e) {
				money += nokori * a;
			}else {
				money += nokori*b;
			}
		}else{
			money += a*d;
			money += b*e;
		}

		int yokei;
		if(d>=e) {
			yokei = 2*c*d;
		}else {
			yokei = 2*c*e;
		}

		int kingaku = 0;
		if(yokei>=money) {
			kingaku = money;
		}else {
			kingaku = yokei;
		}


		System.out.println(kingaku);
	}

}