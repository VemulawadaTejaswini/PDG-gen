import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String s=in.next();
		
		if(s.compareTo("SAT")==0) {
			System.out.println(1);
		}
		else if(s.compareTo("SUN")==0) {
			System.out.println(7);
		}
		else if(s.compareTo("MON")==0) {
			System.out.println(6);
		}
		else if(s.compareTo("TUE")==0) {
			System.out.println(5);
		}
		else if(s.compareTo("WED")==0) {
			System.out.println(4);
		}
		else if(s.compareTo("THU")==0) {
			System.out.println(3);
		}
		else  {
			System.out.println(2);
		}
	}

}
