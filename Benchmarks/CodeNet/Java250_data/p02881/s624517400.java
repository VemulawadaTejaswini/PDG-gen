import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		long a = (long)n-1;
		double d =Math.sqrt(n);
		for(long i=2; i<d+1; i++){
			double b = n/i;
			if(b == (long)b){
				a=(long)b+(long)i-2;
			}
		}
		System.out.println(a);   

	}
}