import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int z = sc.nextInt();
			if(z==0) break;
			
			int x = 1;
			int y = z;
			long max = 0;
			while(x<=y){
				if(x*x*x+y*y*y<=z*z*z){
					max = Math.max(max, x*x*x+y*y*y);
					x++;
				}else{
					y--;
				}
			}
			System.out.println(z*z*z-max);
		}	
	}	
}