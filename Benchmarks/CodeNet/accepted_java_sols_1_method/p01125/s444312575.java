import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			boolean[][] jewels = new boolean[21][21];
			
			for(int i = 0; i < n; i++){
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				
				jewels[y][x] = true;
			}
			
			final int m = sc.nextInt();
			
			int sx = 10, sy = 10;
			int count = 0;
			
			for(int i = 0; i < m; i++){
				int dx = 0, dy = 0;
				
				String str = sc.next();
				
				if("N".equals(str)){
					dy = 1;
				}else if("S".equals(str)){
					dy = -1;
				}else if("W".equals(str)){
					dx = -1;
				}else if("E".equals(str)){
					dx = 1;
				}
				
				final int len = sc.nextInt();
				
				for(int j = 0; j < len; j++){
					sx += dx;
					sy += dy;
					
					if(jewels[sy][sx]){
						count++;
						jewels[sy][sx] = false;
					}
				}
			}
			
			if(count == n){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		
	}

}