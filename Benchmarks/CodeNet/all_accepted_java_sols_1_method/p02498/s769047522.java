import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int alfa = 32;
		String line, ans; char[] lineC;
		
		ans = "";
		line = in.nextLine();
		lineC = line.toCharArray();
		
		for(int i=0;i<lineC.length;i++){
			if(Character.isUpperCase(lineC[i]))
				ans += (char)(lineC[i] + alfa);
			else if(Character.isLowerCase(lineC[i]))
				ans += (char)(lineC[i] - alfa);
			else ans += lineC[i];
		}
		
		System.out.println(ans);
	}
}