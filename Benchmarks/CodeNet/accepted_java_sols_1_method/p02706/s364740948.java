import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int maxday = sc.nextInt();
		int task = sc.nextInt();
		int days = 0;
		for(int i = 0; i < task; i++){
			days += sc.nextInt();
		}
		maxday -= days;
		if(maxday < 0){
			maxday = -1;
		}
		System.out.println(maxday);
		
	}
}