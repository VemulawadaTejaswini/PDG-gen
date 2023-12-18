import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String x = scan.nextLine();
			if(x.equals("0")) break;
			
			int count = 0;
			
			for(int i = 0; i < x.length(); i++) {
				int temp = Character.getNumericValue(x.charAt(i));
				count += temp;
			}
			
			System.out.println(count);
		}
		
	}

}

