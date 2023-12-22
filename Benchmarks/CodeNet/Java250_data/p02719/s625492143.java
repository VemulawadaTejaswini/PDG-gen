import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			long N = scan.nextLong();
			long K = scan.nextLong();
			
			int answer = 0;
			if(N==K) {
				answer = 0;
				System.out.println(0);
			}else if(N<K){
				long sa = Math.abs(N-K);
				long min  = sa;
				long sb = Math.abs(sa-K);
				if(sb<min)min = sb;
				System.out.println(min);
			}else if(N>K) {
				long amari = N%K;
				long sa = Math.abs(amari-K);
				long min  = sa;
				long sb = Math.abs(sa-K);
				if(sb<min)min = sb;
				System.out.println(min);
			}
			
			
			
		}
		
		
	}
		

}
