import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		
		int out = Integer.MAX_VALUE;
		
		for(int i = 0; i<s.length() - t.length()+1; i++) {
			int diff = 0;
			for(int j = 0; j<t.length(); j++) {
				if(s.charAt(j+i) != t.charAt(j)) diff++;
			}
			out = Math.min(out,  diff);
		}
		System.out.println(out);
		
	}
}
