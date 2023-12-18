
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String p = scan.next();
		boolean check = false;
		for(int i = 0 ; i < s.length() ; i++) {
			String fs = s.substring(i,i+1);
			String fp = p.substring(0,1);
			if(fs.equals(fp)){
				String sort = s.substring(i,s.length());
				String c = s.substring(0,i);
				check = search(sort+c,p);
				if(check == true) {
					System.out.println("Yes");
					break;
				}
			}
		}
		if(check == false) {
			System.out.println("No");
		}
	}
	public static boolean search(String s , String p) {
		for(int i = 0 ; i < p.length() ; i++) {
			String fs = s.substring(i,i+1);
			String fp = p.substring(i,i+1);
			if(!fs.equals(fp)){
				return false;
			}
		}

		return true;
	}
}

