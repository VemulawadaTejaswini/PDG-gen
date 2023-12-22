import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		if (0 < a && a <= b){
		 	System.out.println("Positive");
		} else if (a <= b && b < 0){
			if((b - a + 1) % 2 == 0 || b - a == 0){
				System.out.println("Positive");
			} else {
			 	System.out.println("Negative");
			}
		} else if (a <= 0 && 0 <= b){
		 	System.out.println("Zero");
		}
	}
}
