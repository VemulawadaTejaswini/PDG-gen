import java.util.Scanner;

class Main {
	public static void main(String[] args){
		final int[] days = {
			31, 28, 31, 30, 31, 30,
			31, 31, 30, 31, 30, 31
		};
		Scanner input = new Scanner(System.in);
		Leap leap = new Leap();
		
		while (true){
			Day[] day = new Day[2];
			
			for (int i = 0; i < 2; i++){
				int year = input.nextInt();
				int month = input.nextInt();
				int date = input.nextInt();
				if (year < 0 || month < 0 || date < 0) return;
				day[i] = new Day(year, month, date);
			}
			
			int res = 0;
			while (true){
				if (day[0].equal(day[1])){
					System.out.println(res);
					break;
				}
				
				int year = day[0].getYear();
				int month = day[0].getMonth();
				int date = day[0].getDate();
				int tmp = days[month - 1];
				if (leap.isLeap(day[0]) && month == 2) tmp++;
				
				date++;
				if (date > tmp){
					date = 1;
					month++;
				}
				if (month > 12){
					month = 1;
					year++;
				}
				res++;
				
				day[0].setYear(year);
				day[0].setMonth(month);
				day[0].setDate(date);
			}
		}
	}
}

class Day {
	private int year;
	private int month;
	private int date;
	
	public Day(){}
	public Day(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}
	public void printDay(){
		System.out.println("year = " + this.year);
		System.out.println("day = " + this.month);
		System.out.println("date = " + this.date);
	}
	
	public void setYear(int year){
		this.year = year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setDate(int date){
		this.date = date;
	}
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDate(){
		return this.date;
	}
	public boolean equal(Day day){
		int year = day.getYear();
		int month = day.getMonth();
		int date = day.getDate();
		return this.year == year &&
		       this.month == month &&
			   this.date == date;
	}
}

class Leap {
	Leap(){}
	boolean isLeap(Day day){
		int year = day.getYear();
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}