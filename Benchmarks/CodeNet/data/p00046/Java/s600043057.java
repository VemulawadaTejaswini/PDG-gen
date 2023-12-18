import java.util.Scanner;

class Main{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double max = 0, min = 1000000000;
		double m = 0;
		
		while (input.hasNext()){
			m = input.nextDouble();
			
			if (max < m) max = m;
			if (min > m) min = m;
		}
		
		System.out.println(max - min);
	}
}