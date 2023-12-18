import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String S = sc.next();
		 String T = sc.next();
		 int min = Integer.MAX_VALUE;	 
		 for (int i = 0; i < S.length()-T.length()+1; i++) {
			 int count = 0;
			 for (int j= 0; j < T.length(); j++) {
				 if(S.charAt(i+j) != T.charAt(j)) {
					 count++;
				 }
			 }
			 if(min > count) {
				 min = count;
			 }
		 }
		 System.out.print(min);
	}

}
