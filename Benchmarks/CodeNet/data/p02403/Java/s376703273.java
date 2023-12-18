import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if(h == 0) break;
			
			for(int j=0; j<h; j++) {
				for(int i=0; i<w; i++) {
					System.out.print("#");
				}	
				System.out.println("");
			}
			
			System.out.println("");
		}		
		
		
	}
}
