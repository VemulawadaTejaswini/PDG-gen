import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int cnt = 0;
			String W = sc.nextLine();
			while(true) {
				String T = sc.nextLine();
				
				if(T.equals("END_OF_TEXT") )	break;
				
				String[] t = T.toLowerCase().split(" ");
				for(String i:t) {
					if(i.equals(W)) {
						cnt++;
					}
				}
				
			}
			System.out.println(cnt);
			
			
			
		}
	}
}
