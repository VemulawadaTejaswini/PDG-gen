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
			
			if(H == 0) break;	// 1 <=H.W<= 300
			
			int[] hw = new int[]{H, W};
			hws.add(hw);
			
		}
		sc.close();
		
		for(int[] hw : hws) {
			
			for(int hh = 0; hh < hw[0]; hh++) {
				for(int ww = 0; ww < hw[1]; ww++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}