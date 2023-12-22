
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		switch(a) {
		case 1:
			sum += 300000;
			break;
		case 2:
			sum += 200000;
			break;
		case 3:
			sum += 100000;
			break;
		}
		switch(b) {
		case 1:
			sum += 300000;
			break;
		case 2:
			sum += 200000;
			break;
		case 3:
			sum += 100000;
			break;
	}
		if(a == 1 && b == 1) {
			sum += 400000;}
		System.out.println(sum);
		}
	
}
