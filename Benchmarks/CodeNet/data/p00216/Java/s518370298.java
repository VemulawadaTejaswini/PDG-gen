import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int w = in.nextInt();
			if(w == -1)break;
			int S = 0;
			if(w <= 10){
				S = 1150;
			}else if(w <= 20){
				S = 1150 + (w % 10) * 125;
			}else if(w <= 30){
				S = 1150 + 10 * 125 + (w % 20) * 140;
			}else{
				S = 1150 + 10 * 125 + 10 * 140 +(w % 30) * 160;
			}
			S = 4280 - S;
			System.out.println(S);
		}
	}
}