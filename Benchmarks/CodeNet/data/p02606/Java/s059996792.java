import java.util.Scanner;
 
public class Main {
	
	private static Scanner sc;
	
	public static void main (String args[]) {
		sc = new Scanner(System.in);
		int lNum = Integer.parseInt(sc.next());
		int rNum = Integer.parseInt(sc.next());
		int dNum = Integer.parseInt(sc.next());
		int resultNum = 0;
		for(int i = lNum; i<=rNum; i++) {
			int def = i%dNum;
			if(def==0) {
				resultNum++;
			}
		}
		System.out.println(resultNum);		
	}	
}