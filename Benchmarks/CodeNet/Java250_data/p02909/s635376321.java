import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String Sun = "Sunny";
		String Clo= "Cloudy";
		String Rai= "Rainy";

		if(str.equals(Sun)) {
			System.out.println(Clo);
		}
		else if(str.equals(Clo)) {
			System.out.println(Rai);
		}
		else {
			System.out.println(Sun);
		}
	}

}
