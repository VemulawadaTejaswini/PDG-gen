import java.util.*;


class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			String[] list = new String[n];
			for(int i = 0; i < n; i++) {
				int pm = stdIn.nextInt();
				int pe = stdIn.nextInt();
				int pj = stdIn.nextInt();
				int sum = pm + pe + pj;
				if(pm == 100 || pe == 100 || pj == 100 || (pm + pe) >= 180 || sum >= 240 || ((sum >= 210) && (pm >= 80 || pe >= 80))) {
					list[i] = "A";
				}
				else if(sum >= 210 || ((sum >= 150) && (pm >= 80 || pe >= 80))) {
					list[i] = "B";
				}
				else {
					list[i] = "C";
				}
			}
			for(int i = 0; i < n; i++) {
				System.out.println(list[i]);
			}
		}
	}
}