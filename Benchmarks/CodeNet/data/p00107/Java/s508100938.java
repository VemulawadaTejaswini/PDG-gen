import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			int z = stdIn.nextInt();
			if(x == 0 && y == 0 && z == 0) break;
			int n = stdIn.nextInt();
			double c1 = Math.sqrt(x * x + y * y);
			double c2 = Math.sqrt(x * x + z * z);
			double c3 = Math.sqrt(y * y + z * z);
			for(int i = 0; i < n; i++) {
				double r = stdIn.nextDouble();
				r *= 2.0;
				boolean isC = false;
				if(r > c1) isC = true;
				if(r > c2) isC = true;
				if(r > c3) isC = true;
				System.out.println((isC)?"OK":"NA");
			}
			
		}
		
	}

}