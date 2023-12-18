
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0)break;
			int min = 100000;
			
			
			for(int z=0;z<=1000000;z++) {
				if(z > n)break;
				for(int y=0;y<=1000000;y++) {
					if(z*z*z+y*y>n || min<=z+y)break;
					int x = n-y*y-z*z*z;
					min = Math.min(x+y+z, min);
				}
			}
			
			System.out.println(min);
		}
		
	}
}

