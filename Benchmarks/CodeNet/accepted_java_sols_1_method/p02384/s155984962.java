import java.util.Scanner;

class Main {
	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);

		int a[];
		a = new int[7];
		
		int q, r;
		
		int m, n;
				
		for(int i = 1; i < 7; i++){
			
			n = scan.nextInt();
			a[i] = n;
		}
		
		m = scan.nextInt();
		
		for(int i = 0; i < m; i++){
			q = scan.nextInt();
			r = scan.nextInt();
			
			if((q == a[1] && r == a[2]) ||
			   (q == a[2] && r == a[6]) ||
			   (q == a[6] && r == a[5]) ||
			   (q == a[5] && r == a[1])){
				System.out.println(a[3]);
			}else
			if((q == a[2] && r == a[3]) ||
			   (q == a[3] && r == a[5]) ||
			   (q == a[5] && r == a[4]) ||
			   (q == a[4] && r == a[2])){
				System.out.println(a[1]);
			}else
			if((q == a[1] && r == a[4]) ||
			   (q == a[4] && r == a[6]) ||
			   (q == a[6] && r == a[3]) ||
			   (q == a[3] && r == a[1])){
				System.out.println(a[2]);
			}else
			if((q == a[1] && r == a[5]) ||
			   (q == a[5] && r == a[6]) ||
			   (q == a[6] && r == a[2]) ||
			   (q == a[2] && r == a[1])){
				System.out.println(a[4]);
			}else
			if((q == a[1] && r == a[3]) ||
			   (q == a[3] && r == a[6]) ||
			   (q == a[6] && r == a[4]) ||
			   (q == a[4] && r == a[1])){
				System.out.println(a[5]);
			}else
			if((q == a[4] && r == a[5]) ||
			   (q == a[5] && r == a[3]) ||
			   (q == a[3] && r == a[2]) ||
			   (q == a[2] && r == a[4])){
				System.out.println(a[6]);
						}
		}
	}
}