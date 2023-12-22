import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner in = new Scanner(System.in);

		int time = in.nextInt();
		int hours;
		int minuts;
		int second;

		hours = time/3600;
		minuts = (time%3600)/60;
		second = time%60;

		System.out.println(hours + ":" + minuts + ":" + second);






	}

}

