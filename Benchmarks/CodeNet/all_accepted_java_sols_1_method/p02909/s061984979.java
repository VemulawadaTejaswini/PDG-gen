import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		if(a.equals("Sunny")) {
			System.out.print("Cloudy");
		}
		if(a.equals("Cloudy")) {
			System.out.print("Rainy");
		}
		if(a.equals("Rainy")) {
			System.out.print("Sunny");
		}
	}

}
