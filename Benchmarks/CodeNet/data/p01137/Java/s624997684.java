
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0)break;
			int min = 100000;
			for(int z=0;z*z*z<=n;z++) {
				for(int y=0;y*y<=n;y++) {
					for(int x=0;x<=n;x++) {
						if(x+y*y+z*z*z==n) {
							min = Math.min(x+y+z, min);
						}
					}
				}
			}
			System.out.println(min);
		}
		
	}
}

