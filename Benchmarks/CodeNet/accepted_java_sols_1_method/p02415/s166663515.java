import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i < str.length(); ++i){
			char judge = sb.charAt(i);
			if(Character.isLowerCase(judge)){
				char tmp = Character.toUpperCase(judge);
				sb.setCharAt(i,tmp);
			}
			else if(Character.isUpperCase(judge)){
				char tmp = Character.toLowerCase(judge);
				sb.setCharAt(i,tmp);
			}
		}
		System.out.println(sb);
		sc.close();
	}

}