import java.util.Scanner;
public class Main {
	public static int search(String s) {
		int cnt = 0;
		for(int i = 0; i < s.length()/2;i++) {
				if(s.charAt(i)!= s.charAt(s.length()-i-1)) {
					cnt++;
					//s = s.replace(s.charAt(i), s.charAt(s.length()-i-1)) ;
				}
			}
		
		
		
		
		
		return cnt;
	}
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		System.out.println(search(s));
	}

}
