import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		String patt = ob.next();
		int result = 0;
		
		for(int i = 0; i < patt.length(); i++) {
			int temp = 0;
			for(int j = i; j < patt.length(); j++) {
				if(patt.charAt(j) == 'R'){
					temp++;
				}else {
					break;
				}
			}
			result = Math.max(result, temp);
		}
		System.out.println(result);
		ob.close();
	}

}
