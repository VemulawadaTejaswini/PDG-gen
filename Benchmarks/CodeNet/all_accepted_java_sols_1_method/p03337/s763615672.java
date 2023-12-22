import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();

		
        int sumAddition = a + b;

        int sumSubtraction = a - b;

        int sumMultiplication = a * b;

        int tempMax = sumAddition;

        if(tempMax < sumSubtraction) {
        	tempMax = sumSubtraction;
        }
        if(tempMax < sumMultiplication) {
        	tempMax = sumMultiplication;
        }

        System.out.println(tempMax);


	}
}
