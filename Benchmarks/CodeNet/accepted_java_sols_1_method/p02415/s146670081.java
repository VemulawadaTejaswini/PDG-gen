import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		for(int i = 0 ; i < str.length() ; i++ ) {
			if(Character.isLowerCase(str.charAt(i))) sb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			else sb.setCharAt(i,Character.toLowerCase(str.charAt(i)));
		}
		System.out.println(sb);
		sc.close();
	}
}
