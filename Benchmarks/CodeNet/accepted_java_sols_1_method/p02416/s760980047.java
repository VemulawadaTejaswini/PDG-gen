import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			String str = sc.nextLine();
			if(str.equals("0") || str.length() > 1000) {
				break;
			}
			long num = 0;
			for(int i=0; i<str.length(); i++) {
				num += Character.getNumericValue(str.charAt(i));
			}
			System.out.println(num);
		}while(sc.hasNextLine());
		sc.close();
	}
}

