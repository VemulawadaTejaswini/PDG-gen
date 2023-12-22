import java.util.Scanner;


class Main {

	public static void main(String[] args) {   

		Scanner scanner = new Scanner(System.in);
		
		while(true){
		int n=scanner.nextInt();
		if(n == 0){
			break;
		}
		double sum =0;
		double[] s; // 
		s = new double[n];
		 double a=0;
		
		for(int i=0;i<n;i++){
		double S  = scanner.nextDouble();
		s[i]=S;
		sum=sum+S;
		}
		
		for(int i=0;i<n;i++){
			
			a =a+Math.pow(s[i]-(sum/n),2);
			
		}
		
		System.out.println(Math.sqrt(a/n));
		
		}
		scanner.close();
	}
}

