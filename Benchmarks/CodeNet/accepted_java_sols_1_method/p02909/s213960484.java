import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String weather = scanner.nextLine();
		String ans = "";
		if(weather.equals("Sunny"))
			ans = "Cloudy";
		else if(weather.equals("Cloudy"))
			ans = "Rainy";
		else
			ans = "Sunny";
		
		System.out.println(ans);
		
	}
}
