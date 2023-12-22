import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		char[] str1 = str.toCharArray();

		for (int i = 0; i < str1.length; i++) {
			if (Character.isUpperCase(str1[i])) {
				str1[i] = Character.toLowerCase(str1[i]);
			}else if(Character.isLowerCase(str1[i])){
				str1[i] = Character.toUpperCase(str1[i]);
			}
			System.out.print(str1[i]);
		}
        System.out.println();


	}

}