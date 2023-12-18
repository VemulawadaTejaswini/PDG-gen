import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double tall,max,min;
		
		tall = max = min = sc.nextDouble();
		
		while(sc.hasNextDouble()){
			tall = sc.nextDouble();
			if(max < tall) max = tall;
			if(min > tall) min = tall;
		}
		
		System.out.println(max - min);
	}

}