import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			char[] str= stdIn.next().toCharArray();
			for(int i=0;i<str.length; i++) {
				if( Character.isUpperCase( str[i] ) ) {
					System.out.print(Character.toLowerCase(str[i]));
				} else if ( Character.isLowerCase( str[i] ) ){
					System.out.print(Character.toUpperCase(str[i]));
				} else {
					System.out.print(str[i]);
				}
			}
			System.out.print(" ");
			if (".".equals(str)) break;
		}
		stdIn.close();
	}
}

