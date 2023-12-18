import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		int d = a / b;
		int reminder = a % b;
		double f = (double)a / b;
		
		System.out.println(d + " " + reminder + " " + String.format("%.5f", f));
		
		sc.close();
	}

}

