import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String today = scanner.nextLine();
		if(today.equals("Sunny")){
			System.out.println("Cloudy");
		}else if(today.equals("Cloudy")){
			System.out.println("Rainy");
		}else{
			System.out.println("Sunny");
		}
	}
}