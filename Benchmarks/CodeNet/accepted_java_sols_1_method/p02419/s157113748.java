import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String W = sc.next().toLowerCase();
		int cnt = 0;

		while(true) {
			String T = sc.next();
			if(T.equals("END_OF_TEXT")) break;
			if(W.equals(T.toLowerCase())) {
				cnt++;
			}			
		}
		System.out.println(cnt);
		sc.close();
		
	}		
}
