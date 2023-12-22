import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		String ansa = "";
		String ansb = "";
		
		for(int i=0;i<a;i++) {
			ansa += "1";
			ansb += "0";
		}
		for(int i=a;i<w;i++) {
			ansa += "0";
			ansb += "1";
		}
		
		for(int i=0; i<b;i++) {
			System.out.println(ansa);
		}
		for(int i=b;i<h;i++) {
			System.out.println(ansb);
		}
		
	}

}
