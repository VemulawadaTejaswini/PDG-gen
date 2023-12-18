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
				
				if(pm == 100 || pe == 100 || pj == 100 || (pm + pe)/2 >= 90 || (pm + pe + pj)/3 >= 80 || ((pm + pe + pj)/3 >= 70 && (pm >= 80 || pe >= 80))) {
					list[i] = "A";
				}
				else if((pm + pe + pj)/3 >= 70 || ((pm + pe + pj)/3 >= 50 && (pm >= 80 || pe >= 80))) {
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