import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	
	
	public static void main(String[] args) {
		String S=sc.next(),T=sc.next();
		int count=0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)!=T.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}