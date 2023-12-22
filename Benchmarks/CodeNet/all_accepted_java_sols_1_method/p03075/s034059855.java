import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstAnt = 0;
		int lastAnt = 0;
		for(int i = 0;i<5;i++) {
			int tmp = Integer.parseInt(sc.nextLine());
			if(i == 0) {
				firstAnt = tmp;
			}else if(i == 4) {
				lastAnt = tmp;
			}
		}
		int allowedDistant = Integer.parseInt(sc.nextLine());
		String result = "";
		if((lastAnt - firstAnt) <= allowedDistant) {
			result = "Yay!"; 
		}else {
			result = ":(";
		}

		
		
		System.out.println(result);

		
		
		
	}
}
	
	