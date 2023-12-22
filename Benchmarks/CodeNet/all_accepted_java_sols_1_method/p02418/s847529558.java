import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		String p = stdIn.next();
		s += s;
		boolean flag;

		for (int i=0; i<s.length()/2; i++) {
			if(s.charAt(i) == p.charAt(0)){
				flag = true;
				for (int j=i+1,k=1; k<p.length(); j++,k++) {
					if(s.charAt(j) != p.charAt(k))
						flag = false;
				}
				if(flag){
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}