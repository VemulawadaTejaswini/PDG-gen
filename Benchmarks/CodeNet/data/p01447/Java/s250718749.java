import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(calcWorstCount(n));
	}
	
	static int calcWorstCount(int n){
		if(n == 2){
			return 1;
		}
		
		int count = 0;
		while(n >= 2){
			n = (int)Math.ceil(n / 3.0);
//			System.out.println("now n = "+n);
			count++;
		}
		
		return count;
	}

}
