import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int q1 = sc.nextInt();
			
			if(q1 == 0){
				break;
			}

			final int  b = sc.nextInt();
			final int c1 = sc.nextInt();
			final int c2 = sc.nextInt();
			final int q2 = sc.nextInt();
			
			int upper = q2 + 1;
			int lower = 0;
			
			while(upper - lower > 1){
				int med = (upper + lower) / 2;
				
				final int cost = med * c1 + Math.max((q1 - med) * c2, ((b - med * c1) / c2) * c2);
				
				//System.out.println(upper + " " + med + " " + lower + " => " + cost + " : " + b);
				
				if(cost > b){
					upper = med;
				}else if(cost <= b){
					lower = med;
				}
			}
			
			if(lower > q2 || lower == 0){
				System.out.println("NA");
			}else{
				System.out.println((lower) + " " + (Math.max((q1 - lower), ((b - lower * c1) / c2))));
			}
		}

	}
	
}