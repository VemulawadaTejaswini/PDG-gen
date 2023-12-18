import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int strNum = sc.nextInt();

		if (strNum % 2 == 0){
			String str  = sc.next();
			String str1 = str.substring(0, strNum/2);
			String str2 = str.substring(strNum/2, strNum);
			if (str1.equals(str2)){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}


		} else {
			System.out.println("No");
		}

	}

}
