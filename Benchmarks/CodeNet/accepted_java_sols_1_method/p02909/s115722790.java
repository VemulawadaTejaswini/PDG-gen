import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    
	    String[] weathers = {"Sunny", "Cloudy", "Rainy"};
	    
	    for (int i = 0; i < weathers.length; i++) {
	    	if (S.equals("Rainy")) {
	    		System.out.println("Sunny");
	    		break;
	    	} else if (S.equals(weathers[i])) {
	    		System.out.println(weathers[i + 1]);
	    	}
	    }
	}	
}	