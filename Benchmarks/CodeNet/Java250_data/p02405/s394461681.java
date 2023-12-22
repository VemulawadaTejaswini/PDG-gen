import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<int[]> hws = new ArrayList<>();
		while(true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			
			if(H == 0) break;
			
			int[] hw = new int[]{H, W};
			hws.add(hw);
			
		}
		sc.close();
		
		for(int[] hw : hws) {
			
			for(int hh = 0; hh < hw[0]; hh++) {
				for(int ww = 0; ww < hw[1]; ww++) {
					
					if( (hh+ww) % 2 == 0 ) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}