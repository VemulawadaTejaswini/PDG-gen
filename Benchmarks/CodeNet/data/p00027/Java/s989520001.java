import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int month = 1;
	static int day = 1;
	static int Day_ex = 1;
	static int i = 0;
	public static void main(String[] args) {
		while(read());
		
		
	}

	static boolean read(){
		//if(!sc.hasNext())return false;
				
		month = sc.nextInt();
		day = sc.nextInt();
		if(month == 0 && day == 0){
			return false;
		}
		slove();
		return true;
	
	}
	
	static void slove(){
			
		if(3 == month || 1 == month){
			Day_ex = (month - 1) * 30 + day;
		}else if(5 >= month || 2 == month){
			Day_ex = (month - 1) * 30 + day + 1;
		}else if(7 >= month){
			Day_ex = (month - 1) * 30 + day + 2;
		}else if(8 == month){
			Day_ex = (month - 1) * 30 + day + 3;
		}else if(10 >= month){
			Day_ex = (month - 1) * 30 + day + 4;
		} //else(12 >= month)
			Day_ex = (month - 1) * 30 + day + 5;
		
		
		i = Day_ex%7;
		if(i == 1){
			System.out.println("Thursday");
		}else if(i == 2){
			System.out.println("Friday");
		}else if(i == 3){
			System.out.println("Saturday");
		}else if(i == 4){
			System.out.println("Sunday");
		}else if(i == 5){
			System.out.println("Monday");
		}else if(i == 6){
			System.out.println("Tuesday");
		}else{
			System.out.println("Wednesday");
		}
		
	}
}