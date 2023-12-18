import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int[] hiniti = {31,60,91,121,152,182,213,244,274,305,335,366};
			int month = sc.nextInt();
			int day = sc.nextInt();
			int sumday = hiniti[month] + day;
			int date = sumday % 7;
			switch(date){
			case 1:System.out.println("Thursday");break;
			case 2:System.out.println("Friday");break;
			case 3:System.out.println("Saturday");break;
			case 4:System.out.println("Sunday");break;
			case 5:System.out.println("Monday");break;
			case 6:System.out.println("Tuesday");break;
			case 7:System.out.println("Wednesday");break;
			}
		}
	}
}