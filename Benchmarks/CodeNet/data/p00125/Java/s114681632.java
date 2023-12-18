import java.util.Scanner;
import java.util.ArrayList;
	
public class Main {
	public static void main(String[] args) {
		Scanner scanline = new Scanner(System.in);
		while(scanline.hasNext()){
			String twoDates = scanline.nextLine();
			Scanner scandate = new Scanner(twoDates);
			int y1 = scandate.nextInt();
			int m1 = scandate.nextInt();
			int d1 = scandate.nextInt();
			int y2= scandate.nextInt();
			int m2 = scandate.nextInt();
			int d2 = scandate.nextInt();
			if(y1<0 || m1<0 || d1<0 || y2<0 || m2<0 || d2<0){
				break;
			}
			int datesInYear;
			if(leapyear(y1)){
				datesInYear = 366;
			}else{
				datesInYear = 365;
			}
			int number1 = countDatesByYMD(y1,m1,d1);
			int number3 = countDatesByYMD(y2,m2,d2);
			int number2 = countDatesByYear(y1,y2);
			int totalDates = - number1 + number2 + number3;
			if(y1==y2){
				System.out.println(""+(number3-number1));
			}
			else if(y2-y1==1){
				System.out.println(""+(datesInYear-number1+number3));
			}
			else{
				System.out.println(""+(totalDates + datesInYear));
			}			
		}
	}
	public static int countDatesByYear(int y1,int y2){
		if(y2-y1<=1){
			return 0;
		}else{
			int dates=0;
			int datesInYear;
			for (int i=y1+1;i<y2;i++){
				if(leapyear(i)){
					datesInYear = 366;
				}else{
					datesInYear = 365;
				}
				dates += datesInYear;
			}
			return dates;
		}
	}
	public static int countDatesByYMD(int year,int month,int day){
		int dates=0;
		if(leapyear(year)){
		switch(month){
			case 1:
				dates = day;
				break;
			case 2:
				dates = 31+day;
				break;
			case 3:
				dates = 59+day;
				break;
			case 4:
				dates = 90+day;
				break;
			case 5:
				dates = 120+day;
				break;
			case 6:
				dates = 151+day;
				break;
			case 7:
				dates = 181+day;
				break;
			case 8:
				dates = 212+day;
				break;
			case 9:
				dates = 243+day;
				break;
			case 10:
				dates = 273+day;
				break;
			case 11:
				dates = 304+day;
				break;
			case 12:
				dates = 334+day;
				break;
		}
		}else{
			switch(month){
			case 1:
				dates = day;
				break;
			case 2:
				dates = 31+day;
				break;
			case 3:
				dates = 60+day;
				break;
			case 4:
				dates = 91+day;
				break;
			case 5:
				dates = 121+day;
				break;
			case 6:
				dates = 152+day;
				break;
			case 7:
				dates = 182+day;
				break;
			case 8:
				dates = 213+day;
				break;
			case 9:
				dates = 244+day;
				break;
			case 10:
				dates = 274+day;
				break;
			case 11:
				dates = 305+day;
				break;
			case 12:
				dates = 335+day;
				break;
		}
		}
		return dates;
	}
	public static boolean leapyear(int year){
		if (year%4 == 0){
			if (year%100 == 0){
				if (year%400 ==0){
					return true;
				}
				else{
					return false;
				}
			}else{
				return true;
			}
		}else{
			return false;
		}
	}
}