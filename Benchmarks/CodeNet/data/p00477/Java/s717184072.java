import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Main app = new Main();
		while(scan.hasNext()){
			int second = app.input(scan);
			int minute = app.getMinute(second);
			System.out.println(minute);
			System.out.println(second - minute*60);
		}
	}
	
	public int input(Scanner scan){
		int time = 0;
		for(int i=0;i<4;i++){
			time += scan.nextInt();
		}
		
		return time;
	}
	
	public int getMinute(int second){
		int minute = 0;
		
		while(second >= 60){
			minute ++;
			second -= 60;
		}
		
		return minute;
	}
}