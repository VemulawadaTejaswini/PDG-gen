import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();
		long onijo = a + v * t;
		long onika = a  - v* t ;
		long chiljo = b + w *t;
		long chilka = b + w *t;
		if(onijo>1000000000) {
			onijo=1000000000;
		}
		if(onika<-1000000000) {
			onika=-1000000000;
		}
		if(chiljo>1000000000) {
			chiljo=1000000000;
		}
		if(chilka<-1000000000) {
			chilka=-1000000000;
		}
		if(a<b) {
			if(chiljo<=onijo) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			if(onika<=chilka) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
	}

}