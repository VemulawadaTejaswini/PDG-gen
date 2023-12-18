import java.util.Scanner;


public class Main {
	
	public static boolean is_big_month(final int y, final int m){
		if(y % 3 == 0){ return true; }
		if(m % 2 == 0){ return true; }
		return false;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		for(int tt = 0; tt < n; tt++){
			final int y = sc.nextInt();
			final int m = sc.nextInt() - 1;
			final int d = sc.nextInt() - 1;
			
			int count = 0;
			
			int cur_d = d, cur_m = m;
			for(int cur_y = y; cur_y < 1000; cur_y++){
				if(cur_d > 0){
					count += (is_big_month(cur_y, cur_m) ? 20 : 19) - cur_d;
					cur_d = 0;
					cur_m ++;
					
					if(cur_m >= 10){
						cur_m = 0;
						continue;
					}
				}
				
				while(cur_m < 10){
					count += (is_big_month(cur_y, cur_m) ? 20 : 19);
					cur_m++;
				}
				
				if(cur_m >= 10){
					cur_m = 0;
					continue;
				}
			}
			
			System.out.println(count);
		}
		
		
	}
}