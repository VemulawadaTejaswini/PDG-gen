import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int P = in.nextInt();
		
		if (P<= 1000) {
			
			for (int i=0; i<P; i++) {
				
				int[] list = new int[3];
				for (int j=0; j<3; j++) {
	
					int sides = in.nextInt();
					
					if (sides < 1000 & sides > 1) {
						list[j] = sides;
					}
				}
				
				Arrays.sort(list);
				int a = list[0];
				int b = list[1];
				int c = list[2];
				
				if (a*a+b*b == c*c) {
					System.out.println("YES");
				}
				
				else System.out.println("NO");
			
			}
		}
					
	}

}