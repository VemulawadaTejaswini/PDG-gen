import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		long sum = 0;


		int l = s.length();
		for(int i = 0; i < l; i++) {
			int num = Character.getNumericValue(s.charAt(i));
			sum += num;
		}


		if(sum % 9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}




		scan.close();
	}

}
