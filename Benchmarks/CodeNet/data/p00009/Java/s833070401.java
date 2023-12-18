import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try{
			Scanner scan = new Scanner(System.in);
			while(scan.hasNext()){
			String number = scan.nextLine();
			int n = Integer.parseInt(number);
			int eularn = eular(n);
			System.out.printf("%d\n",eularn);
			}
	}
	catch(java.util.NoSuchElementException f){
		System.out.println("Invalid value(s)");
	}
	}
	private static int eular(int n){
		double cntPrime=(double)n;
		int temp=n;
		for(int i=2;i<=n*n/2+1;i++){
			if (temp % i == 0) {
				double zijian=(double)1/i;
				cntPrime*=(double)(1-zijian);
			    	while (temp % i == 0){
			    		temp /= i;
			    	}
			}
		}
		return (int) cntPrime;
	}

}