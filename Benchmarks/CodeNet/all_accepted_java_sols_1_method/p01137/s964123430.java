import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int e = sc.nextInt();
				if(e == 0) break;
				
				int min = Integer.MAX_VALUE;
				for(int z=0; z<1000000; z++) {
					if(z > e) break;
					for(int y=0; y<=1000000; y++) {
						if(z*z*z+y*y > e || min <= z+y) break;
						int x = e - y*y - z*z*z;
						min = Math.min(x+y+z, min);
					}
				}
				System.out.println(min);
			}
		}
	}
}
