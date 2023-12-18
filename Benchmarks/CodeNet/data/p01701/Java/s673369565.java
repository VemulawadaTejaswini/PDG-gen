
import java.util.Scanner;


public class Main {

	public static long gcd(long a, long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a % b);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final String input = sc.next();
			
			if("#".equals(input)){
				break;
			}
			
			String first = null;
			long upper = 0, lower = 1;
			if(input.startsWith("north")){
				first = "north";
				upper = 0;
			}else{
				first = "west";
				upper = 90;
			}
			
			String rest = input;
			while(rest.startsWith(first)){
				upper *= 2;
				lower *= 2;
				rest = rest.substring(first.length());
			}
			
			if(!input.equals(first) && "north".equals(first)){
				upper += 90;
			}else if(!input.equals(first) && "west".equals(first)){
				upper -= 90;
			}
			//System.out.println("=>" + upper + "/" + lower);
			
			if(upper != 0){
				final long gcd = gcd(upper, lower);
				upper /= gcd;
				lower /= gcd;
			}
			
			
			System.out.println(upper + "" + (upper == 0 || lower == 1 ? "" : "/" + lower));
		}
		
	}

}