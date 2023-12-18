import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for(;;){
			String str = scan.next();

			if(str.equals("0"))
				break;

			int ans = 0;

			for(int i=0; i<str.length(); i++){
				ans += Character.getNumericValue(str.charAt(i));
			}

			System.out.println(ans);
		}
	}

}