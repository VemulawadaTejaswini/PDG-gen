import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long x = sc.nextLong();
			long div = x/11L;
			long rem = x%11L;
			
			if(7<=rem&&rem<=10) {
				System.out.println(div*2+2);
			}else if(1<=rem&&rem<=6) {
				System.out.println(div*2+1);
			}else if(rem==0) {
				System.out.println(div*2);
			}
			
			
	    }
		
	}
	
