import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				int e = sc.nextInt();
				if(e == 0)	break;

				int ee= 1 << 30;
				for(int z=0;;z++) {
					int yx = e - z*z*z;
					if(yx < 0) break;
					for(int y=0; y*y <= yx; y++) {
						int x = yx -y*y;
						ee = Math.min(ee, x+y+z);
					}
				}
				
				
				System.out.println(ee);
			}
				
		}
	}
}
