import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String sample = scanner.nextLine();
		if(sample.equals("A")){
			System.out.println("T");
		}else if(sample.equals("T")){
			System.out.println("A");
		}else if(sample.equals("C")){
			System.out.println("G");
		}else{
			System.out.println("C");
		}

	}
}

