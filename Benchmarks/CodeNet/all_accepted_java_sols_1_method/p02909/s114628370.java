import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String weather = sc.next();
		
		String tomorrow = "";
		
		if(weather.equals("Sunny"))
			tomorrow = "Cloudy";
		if(weather.equals("Cloudy"))
			tomorrow = "Rainy";
		if(weather.equals("Rainy"))
			tomorrow = "Sunny";
		
		System.out.println(tomorrow);
	}
}
