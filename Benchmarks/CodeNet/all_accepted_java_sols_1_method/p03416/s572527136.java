import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int cnt = 0;
		for(int i = a; i <= b; i++) {
			int v1 = i % 10;//一の位
			int v2 = i / 10 % 10;//十の位
			int v3 = i / 1000 % 10;//千くらい
			int v4 = i / 10000 % 10;//万の位
			if(v1 == v4 && v2 == v3) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}