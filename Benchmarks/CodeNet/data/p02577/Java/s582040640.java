import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		Float target = sc.nextFloat();
		String strTarget = target.toString();
		float sum = 0;
		strTarget = strTarget.replace(".0", "");

		for (int i = 0; i < strTarget.length(); i++) {
			sum = sum + Character.getNumericValue(strTarget.charAt(i));
		}

		if(sum%9==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		sc.close();
	}
}
