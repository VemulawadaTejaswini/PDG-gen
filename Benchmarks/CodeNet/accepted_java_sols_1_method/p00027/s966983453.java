import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int[] MonthNumOfDay = {
							       31,			// 1月
							       29,			// 2月
								   31,			// 3月
								   30,			// 4月
								   31,			// 5月
								   30,			// 6月
								   31,			// 7月
								   31,			// 8月
								   30,			// 9月
								   31,			//10月
								   30,			//11月
								   31,			//12月
							};
		while(stdIn.hasNext()){
			int numberOfDaysElapsed = 0;
			int[] day = {
						 	stdIn.nextInt(),	//月
						 	stdIn.nextInt()		//日
						};
			if(day[0] == 0 || day[1] == 0)break;
			for(int i = 0;i < day[0] - 1;i++){
				numberOfDaysElapsed += MonthNumOfDay[i];
			}
			numberOfDaysElapsed = numberOfDaysElapsed + day[1] - 1;		//1月1日からの経過日数(例：1月1日なら0日)
			switch (numberOfDaysElapsed % 7) {
			case 0:
				System.out.println("Thursday");
				break;
			case 1:
				System.out.println("Friday");
				break;
			case 2:
				System.out.println("Saturday");
				break;
			case 3:
				System.out.println("Sunday");
				break;
			case 4:
				System.out.println("Monday");
				break;
			case 5:
				System.out.println("Tuesday");
				break;
			case 6:
				System.out.println("Wednesday");
				break;
			default:
				System.out.println("error");
				break;
			}
		}
	}
}