import java.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		if(str1.equals("MON") ) {
			System.out.println(6);
		}else if(str1.equals("TUE")) {
			System.out.println(5);
		}else if(str1.equals("WED")) {
			System.out.println(4);
		}else if(str1.equals("THU")) {
			System.out.println(3);
		}else if(str1.equals("FRI")) {
			System.out.println(2);
		}else if(str1.equals("SAT")) {
			System.out.println(1);
		}else if(str1.equals("SUN")){
			System.out.println(7);
		}
	}
}
