import java.util.Scanner;
import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int m = 1;
		int d = 1;
		for(;;){
			m=sc.nextInt();
			d=sc.nextInt();
			if(m==0) break;
			cal.set(2004,m-1,d);
			switch (cal.get(Calendar.DAY_OF_WEEK)) {  
				case Calendar.MONDAY: System.out.println("Monday");break;
				case Calendar.TUESDAY: System.out.println("Tuesday");break;
				case Calendar.WEDNESDAY: System.out.println("Wednesday");break;
				case Calendar.THURSDAY: System.out.println("Thursday");break;
				case Calendar.FRIDAY: System.out.println("Friday");break;
				case Calendar.SATURDAY: System.out.println("Saturday");break;
				case Calendar.SUNDAY: System.out.println("Sunday");break;
			}
		}
	}
}