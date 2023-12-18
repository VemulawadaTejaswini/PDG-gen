import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			int result = 0;
			for(int i = Integer.parseInt(stdIn.next());i > 1;i--){
				if(IsPrime(i) == 1) result++;
			}
			System.out.println(result);
		}

	}
	
	static int IsPrime(int n){
	    int i;
	 
	    if(n < 2)
	        return 0;
	    else if(n == 2)
	        return 1;
	 
	    if(n % 2 == 0)
	        return 0;
	 
	    for(i = 3; i * i <= n; i += 2)
	         if(n % i == 0)
	            return 0;
	    return 1;
	}

}