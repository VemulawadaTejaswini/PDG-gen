import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] b = x.split(" ");
		int a = Integer.parseInt(b[0]);
		int c = Integer.parseInt(b[1]);
		int d=Integer.parseInt(b[2]);
		if (a<c&&c<d) {System.out.println("Yes");}
		 else {System.out.println("No");}
			

	}
}