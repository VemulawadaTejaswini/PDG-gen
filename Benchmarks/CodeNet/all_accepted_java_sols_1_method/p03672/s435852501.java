import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();	
		String a = S.substring(0, S.length()-1);
		
		while(a.length()>0) {
			if(a.length()%2==0) {
				String[] z = new String[2];
				z[0] = S.substring(0, a.length()/2);
				z[1] = S.substring(a.length()/2, a.length());
			
				if(z[0].equals(z[1])) {
					System.out.println(a.length());
					break;
				}
			}
			a = a.substring(0, a.length()-1);
		}
	}

}