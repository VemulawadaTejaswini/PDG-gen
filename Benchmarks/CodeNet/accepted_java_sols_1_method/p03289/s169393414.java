import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S =in.next();
		int count=0;
		boolean flag=S.matches("A[a-z][a-z,C][a-z,C]*[a-z]");
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='C') {
				count++;
			}
		}
		if(count>=2||count==0) {
			flag=false;
		}
		if(flag) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}
 
	}
}