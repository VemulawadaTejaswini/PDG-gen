import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			long x = sc.nextLong();
			
//			List<Double> compoundIntereset = new ArrayList<>();
			
			long p = 100;
			long i = 0;
			
			while(p < x) {
				
				p = (long)((double)p * 1.01);
				i++;
				
			}
			
			System.out.println(i);
				
		}
	}

}