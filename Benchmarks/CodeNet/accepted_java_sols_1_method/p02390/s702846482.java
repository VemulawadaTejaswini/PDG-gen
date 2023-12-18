import java.util.Scanner;

class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int sec,min,hour;
		sec = sc.nextInt();

		hour = sec / 3600;
		min = (sec%3600) / 60 ;
		sec = sec % 60;
		
		System.out.println(hour + ":" + min + ":" + sec);

		
	}
}
