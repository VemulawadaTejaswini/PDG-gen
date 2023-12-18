import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double m;
		double max = 0, min = 1000000;
		
		while(scan.hasNextDouble()){
			m = scan.nextDouble();
			
			if(m > max)max = m;
			if(m < min)min = m;
		}
		
		System.out.println(max - min);
	}
}