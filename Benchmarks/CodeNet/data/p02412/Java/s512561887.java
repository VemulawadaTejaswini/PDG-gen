
			
import java.util.*;
class Main {
	public static void main(String...args) {
	   
		Scanner scan = new Scanner(System.in);
		while(true) {
			int total = 0;
			int count = 0;
			int	n = scan.nextInt();
			int x = scan.nextInt();
			if(n == 0 && x == 0)
				break;
			for(int i0 = 1; i0 <= n; i0++){
				for(int i1 = 1; i1 <= n; i1++){
					for(int i2 = 1; i2 <= n; i2++){
					    if(i0 != i1 && i1 != i2 && i0 != i2) {
					        if(x == i0 + i1 + i2) {
					            count++;
					        }
					    }
					}
				}	
			}
			System.out.println(count / (3 * 2));
		}
	}
}
