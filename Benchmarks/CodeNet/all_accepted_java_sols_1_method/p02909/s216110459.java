import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String weather = sc.nextLine();
    	String result = "";
    	if("Sunny".equals(weather)) {
    		result = "Cloudy";
    	}else if("Cloudy".equals(weather)) {
    		result = "Rainy";
    	}else if("Rainy".equals(weather)) {
    		result = "Sunny";
    	}
 
    	System.out.println(result);
    	
    	
    }
}