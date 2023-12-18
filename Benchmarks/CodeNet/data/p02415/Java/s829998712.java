import java.util.Scanner;

class Main
{
	public static String invertCase(String str){
		char[] chars = str.toCharArray();
		for(int i=0; i<chars.length; i++){
			chars[i] = Character.isUpperCase(chars[i])
					? Character.toLowerCase(chars[i])
					: Character.toUpperCase(chars[i]);
		}
		return new String(chars);
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println(invertCase(str));
	}
}
