import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		int[] minutes = new int[5];
		int swap;
		int total = 0;
		int mini;
		
		for (int i = 0; i < 5; i++) {
			minutes[i] = stdIn.nextInt();
		}
		
		mini = 9;
		
		for (int i = 0; i < 4; i++) {
			if ((minutes[i] % 10 < mini) && (minutes[i] % 10 != 0)) {
				swap = minutes[i];
				minutes[i] = minutes[4];
				minutes[4] = swap;
				mini = swap % 10;
			}
		}
		
//		System.out.println(minutes[4]);
			
		for (int i = 0; i < 5; i++) {
//			if(minutes[i] % 10 != 0) {
			while (minutes[i] % 10 != 0 && i != 4) {
				minutes[i]++;
			}
//			}
			total += minutes[i];
//			System.out.println(total);
		}
		
		System.out.println(total);
		
	
	}
}