import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		int redA = Integer.parseInt(sc.next());
		int greenB = Integer.parseInt(sc.next());
		int blueC = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		//case : 入力された文字列を取得するとき
//		String str = sc.next();
		for (int i=1; i<=k; i++) {
			if(redA<greenB) {
				if(greenB<blueC) {
					//do nothing
				} else {
					blueC = blueC*2; 
				}
			} else {
				greenB = greenB*2;
			}
		}
		//最終判定
		if(redA<greenB) {
			if(greenB<blueC) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}
}
