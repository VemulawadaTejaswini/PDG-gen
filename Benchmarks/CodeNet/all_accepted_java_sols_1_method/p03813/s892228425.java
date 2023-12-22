import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//入力
		Scanner sc = new Scanner(System.in);
		int rate = sc.nextInt();
		sc.close();
		
		String ans = rate>=1200 ? "ARC" : "ABC";
	
		//出力
		System.out.println(ans);

	}

}