import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//	    int t = in.nextInt();
//	   
//		for(int a0 = 0; a0 < t; a0++) {
			int d = in.nextInt();
			int t = in.nextInt();
			int s = in.nextInt();
			
			double time = (double) d / s;
			
			if(time <= t) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		//}
		
		in.close();
	}
		
	
}
