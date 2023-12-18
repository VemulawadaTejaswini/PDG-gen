import java.util.Scanner;
public class Main {
	
	static String r = "yuiophjklnm";
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				String s = sc.next();
				if(s.equals("#")) break;
				
				int count = 0;
				int m = -1;
				for(char c : s.toCharArray()) {
					boolean right = false;
					for(int i=0; i<r.length(); i++) {
						if(c == r.charAt(i)) right = true;
					}
					if(right) {
						if(m == -1) m = 0;
						else if(m == 1) {
							m = 0;
							count++;
						}
					}
					else {
						if(m == -1) m = 1;
						else if(m == 0) {
							m = 1;
							count++;
						}
					}
				}
				System.out.println(count);
			}
		}
	}
}
