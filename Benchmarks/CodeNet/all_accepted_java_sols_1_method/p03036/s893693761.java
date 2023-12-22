import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r= s.nextInt();
		int D= s.nextInt();
		int Xn= s.nextInt();
		
		for(int i=0;i<10;i++) {
			Xn = r*Xn-D;
			System.out.println(Xn);
		}	
		s.close();
	}
}
