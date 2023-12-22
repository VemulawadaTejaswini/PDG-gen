import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String S = in.next();
		String T = in.next();
		int n = 0;
		
		String SArray[] = S.split("");
		String TArray[] = T.split("");
		
		for(int i = 0;i < SArray.length;i++) {
			if(!SArray[i].equals(TArray[i])) {
				n++;
			}
		}
		
		System.out.println(n);
	}
}