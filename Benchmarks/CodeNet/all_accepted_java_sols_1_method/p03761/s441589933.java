import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
		}
		
		String result = "";
		for(char c = 'a'; c <= 'z'; c++){
			int min = 50;
			for(int i = 0; i < s.length; i++){
				int count = 0;
				for(int j = 0; j < s[i].length(); j++){
					if(s[i].charAt(j) == c){
						count ++;
					}
				}
				min = Math.min(count, min);
			}
			for(int i = 0; i < min; i++){
				result += c;
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
