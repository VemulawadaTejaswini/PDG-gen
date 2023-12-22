import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		String [] words = new String[n];
		boolean flag = true;
		
		for(int i = 0; i < n; i++) {
			words[i] = stdIn.next();
		}
		
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(words[i].equals(words[j])) {
					flag = false;
				}
			}
		}
		for(int i = 0; i < n-1; i++) {
			if(words[i+1].charAt(0) != words[i].charAt(words[i].length()-1)) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
