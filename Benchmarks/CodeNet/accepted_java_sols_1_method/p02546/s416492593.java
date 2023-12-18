import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

//		int[] arrayA = new int[n];
//		for(int i=0;i<n;i++) {
//			arrayA[i] = sc.nextInt();
//		}
		sc.close();


		int l = n.length();

		if(!n.substring(l-1).equals("s")) {
			System.out.println(n+"s");
		}else {
			System.out.println(n+"es");
		}

	}
}
