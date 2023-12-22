import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		long temp = 0;
		temp = a * c;
		if(temp < a * d) temp = a * d;
		if(temp < b * c) temp = b * c;
		if(temp < b * d) temp = b * d;
		
		System.out.println(temp);
	}

}
