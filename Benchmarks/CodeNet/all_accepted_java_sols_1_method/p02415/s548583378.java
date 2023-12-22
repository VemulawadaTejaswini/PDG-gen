import static java.lang.Character.*;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
				for(int i=0; i<str.length(); i++){
					char ch = str.charAt(i);
					if(isLowerCase(ch) == true){
						ch = toUpperCase(ch);
					}else{
						ch = toLowerCase(ch);
					}
					System.out.print(ch);
				}
				System.out.print("\n");
	}

}