import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int M = input.nextInt();
		int D = input.nextInt();
		long cnt = 0;
		for (int day = 22; day <= D; day++) {
			int tens = day/10;
			int ones = day%10;
			if (tens*ones<=M&&tens*ones>0&&ones>1) {
				//System.out.println(tens*ones+" "+day);
				cnt++;
			} 
		}
		System.out.println(cnt);
	}	
}