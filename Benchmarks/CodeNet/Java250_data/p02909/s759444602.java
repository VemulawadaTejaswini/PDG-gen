import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = "Sunny";
		String c = "Cloudy";
		String r = "Rainy";
		Scanner sc = new Scanner(System.in);
		
		String today = sc.nextLine();
		if(today.equals(s)) System.out.println(c);
		if(today.equals(c)) System.out.println(r);
		if(today.equals(r)) System.out.println(s);
		
	}

}