import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int w = stdIn.nextInt();
			if(w == -1) {
				break;
			}
			int sum = 0;
				sum = 1150;
			w-=10;
			for(int i = 0; i < 10; i++) {
				if(w <= 0) {
					break;
				}
				w--;
				sum += 125;
			}
			for(int i = 0; i < 10; i++) {
				if(w <= 0) {
					break;
				}
				w--;
				sum += 140;
			}
			while(true) {
				if(w <= 0) {
					break;
				}
				w--;
				sum += 160;
			}
			System.out.println((sum - 4280) * -1);
		
		}
			
	}
}