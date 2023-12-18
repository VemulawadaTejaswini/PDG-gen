import java.util.Scanner;

/**
 * @author yoshida3203
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
//		char[]a=S.toCharArray();

		if(S.equals("Sunny")){
			System.out.println("Cloudy");
		}else if(S.equals("Cloudy")){
			System.out.println("Rainy");
		}else{
			System.out.println("Sunny");
		}

	}
}

