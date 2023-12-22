import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = String.valueOf(n);
		String[] a = s.split("");
		boolean judge = false;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i].equals("7")) {
				judge = true;
				break;
			}
		}
		if(judge == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
