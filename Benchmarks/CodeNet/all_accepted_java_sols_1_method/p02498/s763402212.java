import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		char[] x = str.toCharArray();
		for (int i = 0; i < x.length; i++) {
			if(Character.isUpperCase(x[i])){
				x[i] = Character.toLowerCase(x[i]);
			}else x[i] = Character.toUpperCase(x[i]);
		}
		System.out.println(x);
	}
}