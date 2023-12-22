import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String W = sc.next();
			int cnt = 0;
			for(;;) {
				String T = sc.next();
				if(T.contentEquals("END_OF_TEXT")) break;
				T = T.toLowerCase();

				if(T.contentEquals(W)) cnt++;
			}
			System.out.println(cnt);
		}
	}
}
