import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toCharArray();
		
		for(int i=0;i<str.length;i++) {
			if(Character.isUpperCase(str[i])) {
				str[i]=Character.toLowerCase(str[i]);
			}
			else if (Character.isLowerCase(str[i]) ) {
				str[i]=Character.toUpperCase(str[i]);
			}else {
				
			}
		}
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		sc.close();

	}

}
