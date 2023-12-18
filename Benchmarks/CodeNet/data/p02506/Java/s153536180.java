import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String W = sc.next();
		
		int cnt = 0;
		
		while(true) {
			String T = sc.nextLine();
			
			if(T.equals("END_OF_TEXT")) {
				break;
			}
			
			String[] splitT = T.split(" ", 0);
			
			for(int i = 0; i < splitT.length; i++) {
				if(splitT[i].equals(W)) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}