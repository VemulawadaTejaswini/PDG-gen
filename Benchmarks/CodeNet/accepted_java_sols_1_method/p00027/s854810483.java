import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int[] hiniti = {0,31,29,31,30,31,30,31,31,30,31,30,31};
			int month = sc.nextInt() ;
			int day = sc.nextInt();
			if(month == 0 && day == 0) break;
			for(int i = 0;i < month;i++){
				day += hiniti[i];
			}
			int date = day % 7;
			switch(date){
			case 1:System.out.println("Thursday");break;
			case 2:System.out.println("Friday");break;
			case 3:System.out.println("Saturday");break;
			case 4:System.out.println("Sunday");break;
			case 5:System.out.println("Monday");break;
			case 6:System.out.println("Tuesday");break;
			case 0:System.out.println("Wednesday");break;
			}
		}
		sc.close();
	}
}