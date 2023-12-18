import java.util.*;

public class Main {
	private String string;

	public static void main(String[] args) {
		new Main().run();
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			string = scan.next();
			
			int joi = 0, ioi = 0;
			for (int i = 0; i < string.length()-2; i++) {
				String str = string.substring(i, i + 3);
				
				if (str.equals("JOI")) {
					joi++;
					i++;
				}else if (str.equals("IOI")) {
					ioi++;
					i++;
				}
				//System.out.println(str);
			}
			System.out.println(joi);
			System.out.println(ioi);
		}
	}

}