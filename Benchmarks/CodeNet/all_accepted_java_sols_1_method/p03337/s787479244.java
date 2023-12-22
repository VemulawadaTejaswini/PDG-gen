import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String sample = scanner.nextLine();
		String[] s = sample.split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		int max = a+b;
		if(max < (a-b)){
			max = a-b;
		}
		if(max < (a*b)){
			max = (a*b);
		}
		System.out.println(max);
	}

}
