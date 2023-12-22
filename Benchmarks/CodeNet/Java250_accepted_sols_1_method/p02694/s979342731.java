	public class Main {
		 
		public static void main(String[] args) {
	 
			java.util.Scanner scan = new java.util.Scanner(System.in);
		
		
			long x = scan.nextLong();
			long m = 100;
			
			for(int i = 1 ; m < x; i++) {
				m = m / 100 + m ;
				if (m >= x) {
					System.out.println(i);
				}
			}
	 
		}
	 
	}
