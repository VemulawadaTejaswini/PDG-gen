import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int z=0;z<n;z++){
			int maxx = 0;
			int maxy = 0;
			int prex = 0;
			int prey = 0;
			double d = 0;
			int x, y;
			while(true){
				x = sc.nextInt();
				y = sc.nextInt();
				if(x==0 && y==0) break;
				x += prex;
				y += prey;
				if(d<Math.sqrt(x*x+y*y) || (d==Math.sqrt(x*x+y*y) && x>maxx)){
					d = Math.sqrt(x*x+y*y);
					maxx = x;
					maxy = y;
				}
				prex = x;
				prey = y;
			}
			System.out.println(maxx + " " + maxy);
		}
	}	
}