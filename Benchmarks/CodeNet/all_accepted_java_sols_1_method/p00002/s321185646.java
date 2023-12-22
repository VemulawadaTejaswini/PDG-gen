import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner bala= new Scanner(System.in);
		while(bala.hasNext()) {
			int a = bala.nextInt();
			int b = bala.nextInt();
			int res = a + b;
			String cad = res + "";
			System.out.println(cad.length());
		}
	}
}