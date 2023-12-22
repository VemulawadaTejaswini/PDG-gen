import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		String s="Sunny";
		String c="Cloudy";
		String r="Rainy";
		if(S.equals(s)){
			System.out.print("Cloudy");
		}
		else if(S.equals(c)){
			System.out.print("Rainy");
			
		}
		else if(S.equals(r)){
			System.out.print("Sunny");
		}

	}

}
