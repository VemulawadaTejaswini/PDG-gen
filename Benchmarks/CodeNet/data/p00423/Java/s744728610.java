import java.util.*;

public class Main {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.nextLine();
			
			if (str == null || "".equals(str)) {
				break;
			}
			
			int n = Integer.parseInt(str);
			
			int aPoint = 0;
			int bPoint = 0;
			for (int i = 0; i < n; i++) {
				String[] input = sc.nextLine().split(" ");
				int a = Integer.parseInt(input[0]);
				int b = Integer.parseInt(input[1]);
				
				if (a > b) {
					aPoint += (a + b);
				} else if (a < b) {
					bPoint += (a + b);
				} else {
					aPoint += a;
					bPoint += b;
				}
			}	
			System.out.println(aPoint + " " + bPoint);
		}
	}
}