
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String qwright = "nmhjklyuiop" ;
			
			int n = sc.nextInt();
			String[] u = new String[n];
			//String uu = "";
			for(int i=0; i<n; i++) {
				u[i] = sc.next();
				//uu += sc.next() + ",";
			}
			int m = sc.nextInt();
			int flag = 0;
			for(int i=0; i<m; i++) {
				String t = sc.next();
				
				for(int j=0; j<n; j++) {
					boolean look = false;
					for(int k=0; k<n; k++) {
						if(u[k].equals(t)) {
							look = true;
							break;
						}
					}
					if(look) {
						if(flag == 0) {
							System.out.println("Opened by "+ t);
							flag = 1;
							break;
						}else if(flag == 1){
							System.out.println("Closed by "+ t);
							flag = 0;
							break;
						}
					}else {
						System.out.println("Unknown "+ t);
						break;
					}
				}
				
				
			}
			
			
			
			
			
		}
	}
}


