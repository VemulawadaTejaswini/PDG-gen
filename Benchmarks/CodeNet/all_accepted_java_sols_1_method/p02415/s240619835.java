import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.print(" ");
		Scanner scan = new Scanner(System.in);
		String moji =scan.nextLine();
		char[] ichimoji = moji.toCharArray();
		int nagasa = moji.length();

		for(int i=0; i<nagasa; i++){
			if (Character.isUpperCase(ichimoji[i])){
				ichimoji[i] = Character.toLowerCase(ichimoji[i]);
			}
			else if(Character.isLowerCase(ichimoji[i])){
				ichimoji[i] = Character.toUpperCase(ichimoji[i]);
			}
			else{}
			System.out.print(ichimoji[i]);
		}
		System.out.println("");
	}
}