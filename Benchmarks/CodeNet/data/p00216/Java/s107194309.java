import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int w;
		
		while (true){
			w = input.nextInt();
			int rs = 0;
			
			if (w == -1){
				break;
			}
			
			if (w <= 10){
				rs = 1150;
			}
			else if (w <= 20){
				rs = 1150 + (w - 10) * 125;
			}
			else if (w <= 30){
				rs = 1150 + 1250 + (w - 20) * 140;
			}
			else if (30 < w){
				rs = 1150 + 1250 + 1400 + (w - 30) * 160;
			}
			
			System.out.println(4280 - rs);
		}
	}
}