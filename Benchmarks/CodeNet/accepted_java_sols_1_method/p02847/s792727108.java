import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		String s = sc.next();
		int num = 0;
		
		if(s.equals("SUN")) {
		 num = 7;
		} else if(s.equals("MON")) {
			 num = 6;
			} else if(s.equals("TUE")) {
				 num = 5;
			} else if(s.equals("WED")) {
				 num = 4;
			} else if(s.equals("THU")) {
				 num = 3;
			} else if(s.equals("FRI")) {
				 num = 2;
			} else if(s.equals("SAT")) {
				 num = 1;
			}
	
		
		System.out.println(num);
		
	
		
		
		
	}
}
