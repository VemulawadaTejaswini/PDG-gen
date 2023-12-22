import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char[] c = s.toCharArray();

		for(int i = 0; i < c.length; i++){
			if(Character.isUpperCase(c[i])){
				c[i] = Character.toLowerCase(c[i]);
			}else if(Character.isLowerCase(c[i])){
				c[i] = Character.toUpperCase(c[i]);
			}else{
				c[i] = c[i];
			}
		}

		System.out.println(c);
		
	}
}