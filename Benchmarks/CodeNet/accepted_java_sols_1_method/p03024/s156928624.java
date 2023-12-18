import java.util.*;
public class Main {
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		

		
		String s = sc.next();
		
		int  count = 0;
		// 15 8以上
		for(char c: s.toCharArray()) {
			if(c == 'o') {
				count++;
			}
		}
		
		int rest = 15 - s.length();
		String answer = (count + rest) >= 8 ? "YES" : "NO";
		System.out.println(answer);
		
		

	}
	


}