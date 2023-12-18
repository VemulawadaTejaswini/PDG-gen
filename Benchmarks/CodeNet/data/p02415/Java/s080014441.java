import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strIn = scan.nextLine();
		String strAns = "";
		char charTemp;
		for(int i = 0; i < strIn.length(); i++){
			charTemp = strIn.charAt(i);
			if(Character.isLowerCase(charTemp)){
				charTemp = Character.toUpperCase(charTemp);
			}else if(Character.isUpperCase(charTemp)){
				charTemp = Character.toLowerCase(charTemp);
			}
			strAns += charTemp;
		}
		System.out.println(strAns);
		scan.close();
	}
}