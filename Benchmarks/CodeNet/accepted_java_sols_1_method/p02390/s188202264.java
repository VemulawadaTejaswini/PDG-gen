import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int second = input.nextInt();
	    int min = second / 60; 
	    int hour = min / 60;
	    int min2 = min % 60; 
	    int second2 = second % 60; 
	    
	    System.out.println(hour + ":" + min2 + ":" + second2);
		
		input.close();
	}

}