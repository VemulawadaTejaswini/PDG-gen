import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String[] weather = {"Sunny", "Cloudy","Rainy"};

		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		if(S.equals(weather[0])){
			System.out.println(weather[1]);
		}else if(S.equals(weather[1])){
			System.out.println(weather[2]);
		}else if(S.equals(weather[2])){
			System.out.println(weather[0]);
		}
	}
}
