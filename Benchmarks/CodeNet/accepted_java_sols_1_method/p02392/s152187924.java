import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		int c=n.nextInt();
		
		if (a<b && b<c) { System.out.println("Yes");
		} else {	 System.out.println("No");
		}
	}

}