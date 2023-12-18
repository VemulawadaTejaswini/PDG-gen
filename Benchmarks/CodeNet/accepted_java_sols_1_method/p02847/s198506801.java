import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(s.equals("SAT")) System.out.print(1);
		if(s.equals("SUN")) System.out.print(7);
		if(s.equals("MON")) System.out.print(6);
		if(s.equals("TUE")) System.out.print(5);
		if(s.equals("WED")) System.out.print(4);
		if(s.equals("THU")) System.out.print(3);
		if(s.equals("FRI")) System.out.print(2);

	}
}