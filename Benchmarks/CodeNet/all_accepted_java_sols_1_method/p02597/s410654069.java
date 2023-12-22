import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
		
			int n = sc.nextInt();
			
			char[] stones = sc.next().toCharArray();
			
			
			//基本は入れ替えすればよい
			int lp = 0;
			int rp = n-1;
			
			int count = 0;
			while(true) {
				while( stones[lp] == 'R' && lp < n-1) {
					lp++;
				}
				while( stones[rp] == 'W' && rp > 0) {
					rp--;
				}
				
//				System.out.println(lp + " " + rp);
				
				if ( lp >= rp) {
					break;
				}
				
				if ( stones[lp] == 'W' && stones[rp] == 'R' ) { 
					stones[lp] = 'R';
					stones[rp] = 'W';
					count++;
				}

			}
			
			System.out.println(count);
			
		}
	}

}