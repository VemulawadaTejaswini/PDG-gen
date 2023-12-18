import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
Scanner stdin = new Scanner(System.in);
	    int number1 = stdin.nextInt();
	    int number2 = stdin.nextInt();
	    int number3 = stdin.nextInt();
	    int temp = 0;
		if (number1 > number2) {
		       temp = number1;
		       number1 = number2;
		       number2 = temp;
		    }
		if (number2 > number3) {
		       temp = number2 ;
		       number2= number3;
		       number3= temp;
		    }
		if (number1 > number2) {
		      temp =number1;
		      number1 = number2;
		      number2 = temp;
		    }
		System.out.println(number1 + " " + number2 + " " + number3);
	}
}