import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		char[] chr= new char[1200];

		str=scan.nextLine();
		chr=str.toCharArray();

		for(int i=0;i<chr.length;i++){
			str=String.valueOf(chr[i]);
		 if(Character.isUpperCase(chr[i])){
			 str=str.toLowerCase();
		}else if(Character.isLowerCase(chr[i])){
			str=str.toUpperCase();
		}
		  chr[i]=str.charAt(0);
		}

		str=String.copyValueOf(chr);
		System.out.println(str);
	}

}