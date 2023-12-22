import java.util.Arrays;

	public class Main {
		 
		public static void main(String[] args) {
	 
			java.util.Scanner scan = new java.util.Scanner(System.in);
		

			int n = scan.nextInt();
			int k = scan.nextInt();
			Integer[] a = new Integer [n];
			int iii = 0;
			int sum = 0;
			
			for (int i = 0 ; i < k ; i++) {
				int m = scan.nextInt();
				for(int ii = 0; ii < m ; ii++) {
					int b = scan.nextInt();
					if(Arrays.asList(a).contains(b)) {
						
					} else {
						a[iii] = b;
						iii++;
					}
				}
			}
		for (int i = 1; i <= n ; i++ ) {
			for (int ii = 0 ; ii < iii; ii++) {
				if(a[ii] == i) {
					break;
				} else if (ii == iii-1) {
					sum ++;
				}
			}
		}
		
		
		System.out.println(sum);
		
		
		}
	 
	}
