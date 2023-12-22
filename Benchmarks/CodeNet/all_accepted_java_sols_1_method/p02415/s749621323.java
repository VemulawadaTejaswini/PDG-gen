import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		String S = s.nextLine();
		String ans = "";
		
		for(int i = 0; i< S.length(); i++){
			if(Character.isUpperCase(S.charAt(i))){
				ans += Character.toLowerCase(S.charAt(i));
			}else if(Character.isLowerCase(S.charAt(i))){
				ans += Character.toUpperCase(S.charAt(i));
			}else{
				ans += S.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
