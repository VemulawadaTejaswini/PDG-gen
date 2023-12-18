import java.util.*;
public class Main {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		char[] chars = input.trim().toCharArray();
		boolean prevBlack = (chars[0] == 'B'); 
		int result = 0;
		//find blocks 
		for (int i = 0; i < chars.length; i++){
			if (prevBlack && chars[i] == 'B') continue; 
			if ((!prevBlack) && chars[i] == 'W') continue;
			if (chars[i] == 'B') prevBlack = true;
			if (chars[i] == 'W') prevBlack = false;
			result++;
		}
		System.out.println(result);
	}
}
