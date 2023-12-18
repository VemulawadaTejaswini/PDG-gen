import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		String s="";
		for(int i=0;i<3;i++) {
			if (S.charAt(i) == '1') {
				s=s+'9';
			}else if(S.charAt(i) == '9'){
					s=s+'1';
			}else {
				s=s+S.charAt(i);
			}
		}
		

		
		System.out.print(s);

	}
}
