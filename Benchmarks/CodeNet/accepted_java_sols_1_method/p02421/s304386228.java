import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();

		int taroP = 0;
		int hanaP = 0;
		for (int i = 0; i < n; i++) {
			String taro = sc.next();
			String hana = sc.next();
			int result = taro.compareTo(hana);
			if (result < 0) {
				hanaP += 3;
			} else if (result > 0) {
				taroP += 3;
			} else {
				taroP++;
				hanaP++;
			}
		}
		System.out.println(taroP + " " + hanaP);
		
		sc.close();
	}
}