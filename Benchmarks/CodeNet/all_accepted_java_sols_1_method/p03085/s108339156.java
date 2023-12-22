import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String b = s.next();
		
		String result = null;
		
		switch(b) {
		case "A":
			result = "T";
			break;
		case "C":
			result = "G";
			break;
		case "G":
			result = "C";
			break;
		case "T":
			result = "A";
			break;
		}
		
		System.out.println(result);
		s.close();
		
	}

}