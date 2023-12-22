import java.util.*;
import java.text.*;
import java.math.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		while(true){
			int m = in.nextInt();
			int d = in.nextInt();
			if((m|d) == 0) break;
			int day = d;
			switch(m){
			case 12:
				day += 335;
				break;
			case 11:
				day += 305;
				break;
			case 10:
				day += 274;
				break;
			case 9:
				day += 244;
				break;
			case 8:
				day += 213;
				break;
			case 7:
				day += 182;
				break;
			case 6:
				day += 152;
				break;
			case 5:
				day += 121;
				break;
			case 4:
				day += 91;
				break;
			case 3:
				day += 60;
				break;
			case 2:
				day += 31;
				break;
			default:
			}
			switch(day%7){
			case 1:
				System.out.println("Thursday");
				break;
			case 2:
				System.out.println("Friday");
				break;
			case 3:
				System.out.println("Saturday");
				break;
			case 4:
				System.out.println("Sunday");
				break;
			case 5:
				System.out.println("Monday");
				break;
			case 6:
				System.out.println("Tuesday");
				break;
			case 0:
				System.out.println("Wednesday");
				break;
			}
		}
	}
}