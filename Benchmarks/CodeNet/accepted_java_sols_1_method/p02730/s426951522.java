import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String s = stdIn.next();
		
		boolean flag = true;
		
		
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				flag = false;
			}
		}
		

		int cnt = 1;
		for(int i = 0; i < (s.length()-1)/2; i++) {
			if(s.charAt(i)!=s.charAt((s.length()-1)/2-cnt)){
				flag = false;
			}
			cnt++;
		}
		

		cnt = 0;
		for(int i = (s.length()+3)/2-1; i < s.length(); i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-cnt)){
				flag = false;
			}
			cnt++;
		}

		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
