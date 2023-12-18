import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer ioi = new StringBuffer();
		String ts;
		String rs;
	
		int count;
		int p;
		
		String n = scanner.nextLine();
		while (Integer.valueOf(n).intValue() != 0) {
			ioi.setLength(0);
			ioi.append("IOI");
			ts = scanner.nextLine();
			ts = scanner.nextLine();
			count = 0;
			
			for(int i = 1; i < Integer.valueOf(n).intValue(); i++) {
				ioi.append("OI");
			}
			rs = ioi.toString();
			
			p = ts.indexOf(rs, 0);
			while (p > -1) {
				count++;
				p = ts.indexOf(rs, p + 1);
			}
			
			System.out.println(count);
			
			n = scanner.nextLine();
		}
	}

}