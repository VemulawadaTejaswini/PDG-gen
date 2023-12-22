
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String strB = "";

		String strA = sc.nextLine();
	//	System.out.println("??\?????????????????? : "+strA);
	//	System.out.println("");


		for(int i = 0; i < strA.length(); i++) {
			strB = strA.substring(i,i+1);

		//	System.out.println("strB.charAt(0) : "+strB.charAt(0));

			//??§????????????true
			if(Character.isUpperCase(strB.charAt(0))) {
				Character.toLowerCase(strB.charAt(0));
				System.out.print(Character.toLowerCase(strB.charAt(0)));
			}
			//?°???????????????§???????????????
			else {
				if(strB == " " || strB == "," || strB == ".") {
					System.out.println(strB);
				}
				else {
					Character.toUpperCase(strB.charAt(0));
					System.out.print(Character.toUpperCase(strB.charAt(0)));
				}
			}

		}
		System.out.println("");
	}
}