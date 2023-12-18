import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		String next = "";
		if(s.equals("Sunny")) next = "Cloudy";
		else
		if(s.equals("Cloudy")) next = "Rainy";
		else
		if(s.equals("Rainy")) next = "Sunny";
		
		System.out.println(next);		
		in.close();
	}
}