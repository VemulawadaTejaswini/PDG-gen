
	public class Main {
		 
		public static void main(String[] args) {
	 
			java.util.Scanner scan = new java.util.Scanner(System.in);
		

			long x = scan.nextLong();
			
			for( int a = -1000; a <= 1000; a++) {
				for(int b = -1000; b <= 1000; b++ ) {
					if(Math.pow(a, 5)== x + Math.pow(b, 5)) {
						System.out.println(a + " " + b);
					return;
					}
				}
			}
			
			
		
		}
	 
	}
