import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int r = stdIn.nextInt(); String r1 = String.valueOf(r);
		int g = stdIn.nextInt(); r1+= String.valueOf(g);
		int b = stdIn.nextInt(); r1 += String.valueOf(b);
		int c = Integer.parseInt(r1);
		if(c%4==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
		
		
	}

}
