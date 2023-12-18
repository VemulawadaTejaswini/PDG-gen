import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			String[] before = new String[n];
			String[] after = new String[n];
			for(int i = 0; i < n; i++) {
				before[i] = stdIn.next();
				after[i] = stdIn.next();
			}
			
			int nm = stdIn.nextInt();
			for(int i = 0; i < nm; i++) {
				String tmp = stdIn.next();
				boolean cc = false;
				for(int j = 0; j < n; j++) {
					if(before[j].charAt(0) == tmp.charAt(0)) {
						System.out.print(after[j]);
						cc = true;
						break;
					}
				}
				if(!cc) {
					System.out.print(tmp);
				}
			}
			System.out.println();
			
			
			
		}
	}
}