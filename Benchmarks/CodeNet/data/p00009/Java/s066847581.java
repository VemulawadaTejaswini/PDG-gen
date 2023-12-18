import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try{
			Scanner scan = new Scanner(System.in);
			while(scan.hasNext()){
			String number = scan.nextLine();
			int n = Integer.parseInt(number);
			int eularn = eular(n);
			System.out.printf("%d",eularn);
			}
	}
	catch(java.util.NoSuchElementException f){
		System.out.println("Invalid value(s)");
	}
	}
	private static int eular(int n){
		int cntPrime=n;
		for(int i=1;i<=n*n/2+1;i++){
			if (n % i == 0) {
				cntPrime -= cntPrime / i;
			    	while (n % i == 0){
			    		n /= i;
			    	}
			}
			  if (n > 1) cntPrime -= cntPrime / n;
		}
		return cntPrime;
	}

}