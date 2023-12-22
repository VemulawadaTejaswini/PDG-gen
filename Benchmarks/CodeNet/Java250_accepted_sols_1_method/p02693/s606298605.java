import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int k,a,b,x;
		Scanner sc = new Scanner(System.in);
		
		k = Integer.parseInt(sc.next());
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		
		sc.close();
		
		x = (b / k) * k;
		if(a <= x) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
}