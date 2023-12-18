import java.util.Arrays;
import java.util.Scanner;

public class Main {
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int e = sc.nextInt();
			
			if(e == 0){
				break;
			}
			
			int min = Integer.MAX_VALUE;
			
			for(int z = (int)(Math.cbrt(e)); z >= 0; z--){
				for(int y = (int)(Math.sqrt(e - z*z*z)); y >= 0; y--){
					int x = e - z*z*z - y*y;
					
					min = Math.min(min, x + y + z);
				}
			}
			
			System.out.println(min);
		}
		
	}

}