import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long X = scan.nextLong();
		long cnt=0, money=100;

		while(money < X){
			cnt++;
			money += money*0.01;
		}

		System.out.println(cnt);

		scan.close();
	}
}
