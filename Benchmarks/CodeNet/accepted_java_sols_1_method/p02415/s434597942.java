import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String str="";
		String conv_str="";

		Scanner sc= new Scanner( System.in );
		str = sc.nextLine();

		for ( int i = 0 ; i < str.length() ; i++ ) {
			if(Character.isUpperCase(str.charAt(i))) {
				conv_str += String.valueOf(str.charAt(i)).toLowerCase();
			}else if(Character.isLowerCase(str.charAt(i))) {
				conv_str += String.valueOf(str.charAt(i)).toUpperCase();
			}else {
				conv_str += String.valueOf(str.charAt(i));
			}
		}

		System.out.println( conv_str );

		sc.close();
	}
}

