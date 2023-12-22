
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		if(line.equals("A")) {
			System.out.println("T");
		}else if(line.equals("T")) {
			System.out.println("A");			
		}else if(line.equals("C")) {
			System.out.println("G");			
		}else {
			System.out.println("C");			
		}
	}

}
