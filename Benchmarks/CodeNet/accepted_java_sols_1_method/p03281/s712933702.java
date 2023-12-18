import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		
		int count = 0;
		int num = 0;
		int numplus = 0;
		int divisor_count = 0;
		int Ncount = 0;
		
		
		
		for (Ncount = 1; Ncount <= N; Ncount = Ncount + 2){
			num = Ncount;
			for (numplus = 1; num >= numplus; numplus++){
				if (num % numplus == 0){
					count++;
				}
				
			}
			numplus = 0;
			
			if (count == 8){
				divisor_count++;
			}
			count = 0;
		}
		
		
		System.out.println(divisor_count);
		
	}
}

