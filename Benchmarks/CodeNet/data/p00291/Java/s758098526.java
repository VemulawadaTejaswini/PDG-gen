import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new  Scanner(System.in);
		int[] c = new int[6];
		int i;
		int sum;
		
		for (i = 0; i < 6; i++){
			c[i] = input.nextInt();
		}
		
		sum = c[5] * 500 + c[4] * 100 + c[3] * 50 + c[2] * 10 + c[1] * 5 + c[0];
		
		if (sum >= 1000){
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}