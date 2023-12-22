import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long A = scan.nextLong();
			long B = scan.nextLong();
			long C = scan.nextLong();
			long D = scan.nextLong();
			
			long bc = B/C;
			long bd = B/D;
			long bcd = B/lcm(C,D);
			
			long ac = A/C;
			long ad = A/D;
			long acd =A/lcm(C,D);
			
			long Bwari = B-bc-bd+bcd;
			long Awari = A-ac-ad+acd;
			
			if(A%C!=0&&A%D!=0) {
				System.out.println(Bwari-Awari+1);
			}else {
				System.out.println(Bwari-Awari);
			}
			
			
			
		}
		
		
	}
	
	
	
	private  static long lcm(long A,long B) {//最小公倍数
		return A*B/gcd(A,B);
	}
	
	private static long gcd(long A,long B){//最大公約数
		return B==0?A:gcd (B,A%B);
	}
		

}
