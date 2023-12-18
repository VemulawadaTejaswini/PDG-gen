import java.util.Scanner;

public class Main {
	
	public static boolean isPrime(int num){
	    if ( num > 2 && num%2 == 0 ) {
	        return false;
	    }
	    int top = (int)Math.sqrt(num) + 1;
	    for(int i = 3; i < top; i+=2){
	        if(num % i == 0){
	            return false;
	        }
	    }
	    return true; 
	}

	public static void main(String[] args) {
		// scan in the numbers
		Scanner sc = new Scanner(System.in);
		int listSize = sc.nextInt();
		int primeNum = 0;
		if (listSize >= 1 && listSize<= 10000) {
			for(int i = 0; i < listSize; i++) {
				int value = sc.nextInt();
				int exp = (int) Math.pow(10, 8);
				if( value >= 2 && value <= exp && isPrime(value) ) {
					primeNum++;
				}
			}
			// print the number of prime numbers in the given list
			System.out.println(primeNum);
		}
		
	}

}

