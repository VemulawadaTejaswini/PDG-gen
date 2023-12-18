import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println(SecondtoHMS(Integer.parseInt(str)));
	}
	
	public static String SecondtoHMS(int second){
		int h = 0, m = 0, s = 0;
		
		while(second >= 60 * 60){
			second -= 60 * 60;
			h ++;
		}
		
		while(second >= 60){
			second -= 60;
			m ++;
		}
		
		s = second;
		
		return h + ":" + m + ":" + s;
	}
}