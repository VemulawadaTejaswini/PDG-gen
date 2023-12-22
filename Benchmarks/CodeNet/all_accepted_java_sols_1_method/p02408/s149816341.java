import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] s = new int[14];
		int[] h= new int[14];
		int[] c = new int[14];
		int[] d = new int[14];
		
		int sint = 0;
		int hint = 0;
		int cint = 0;
		int dint = 0;
		
		
		for(int i = 0;i < n;i++) {
			
			String kigou = sc.next();
			
			int kazu = sc.nextInt();
			
			
			if(kigou.equals("S")) {
				s[sint] = kazu;
				sint += 1;
			}else if(kigou.equals("H")) {
				h[hint] = kazu;
				hint += 1;
			}else if(kigou.equals("C")) {
				c[cint] = kazu;
				cint += 1;
			}else if(kigou.equals("D")) {
				d[dint] = kazu;
				dint += 1;
			}
			
			
			
				
			}
			
		
		for(int j = 1;j <= 13;j++) {
			for(int k = 0;k < 13;k++) {
				if(s[k] == j) {
					break;
					
				}
			if(k == 12) {
				System.out.println("S" + " " + j);
			}
			
			}
		}
		
		for(int j = 1;j <= 13;j++) {
			for(int k = 0;k < 13;k++) {
				if(h[k] == j) {
					break;
					
				}
			if(k == 12) {
				System.out.println("H"+ " " + j);
			}
			
			}
		}
		
		for(int j = 1;j <= 13;j++) {
			for(int k = 0;k < 13;k++) {
				if(c[k] == j) {
					break;
					
				}
			if(k == 12) {
				System.out.println("C"+ " " + j);
			}
			
			}
		}
		
		for(int j = 1;j <= 13;j++) {
			for(int k = 0;k < 13;k++) {
				if(d[k] == j) {
					break;
					
				}
			if(k == 12) {
				System.out.println("D"+ " " + j);
			}
			
			}
		}
			
		}

		

}

