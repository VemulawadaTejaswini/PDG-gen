
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			int[]s = new int[2000];
			
			int ase = (double)((A*25)/2)==(A*25.0)/2.0?(A*25)/2:(A*25)/2+1;
			int ako = (double)(((A+1)*25)/2)==((A+1)*25.0)/2.0?((A+1)*25)/2-1:((A+1)*25)/2;
			
			int bse = B*10;
			int bko = B*10+9;
			
			for(int i = ase-1;i<ako;i++) {
				s[i]++;
			}
			for(int i = bse-1;i<bko;i++) {
				s[i]++;
			}
			
			int ok=0;
			for(int i = 0;i<2000;i++) {
				if(s[i]==2) {
					ok=1;
					System.out.println(i+1);
					break;
				}
			}
			
			if(ok==0)System.out.println(-1);
			
			
			
			
		}	
	}
}
