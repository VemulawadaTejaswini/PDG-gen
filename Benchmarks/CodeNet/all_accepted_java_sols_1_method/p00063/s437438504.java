import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int cnt = 0;
			while(sc.hasNext()) {
				String str = sc.next();
				StringBuffer sb = new StringBuffer(str);
				if(str.equals(sb.reverse().toString())) {
					cnt++;
				}
			}
			System.out.println(cnt);

			
		}
	}
}




