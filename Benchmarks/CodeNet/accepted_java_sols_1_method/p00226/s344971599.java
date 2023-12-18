import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			String r = stdIn.next();
			String a = stdIn.next();
			
			if(r.equals("0") && a.equals("0")) {
				break;
			}
			int hit = 0;
			int blow = 0;
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					if(i == j) {
						if(r.charAt(i) == a.charAt(j)) {
							hit++;
							break;
						}
					}
					else {
						if(r.charAt(i) == a.charAt(j)) {
							blow++;
							break;
						}
					}
				}
			}
			System.out.println(hit + " " + blow);
			
			
		}
	}
}