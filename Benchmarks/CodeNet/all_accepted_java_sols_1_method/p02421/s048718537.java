import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			int n = sc.nextInt();
			
			int taroPoint = 0;
			int hanakoPoint = 0;
			
			for(int i = 0; i < n; i++) {
				String taroCard = sc.next();
				String hanakoCard = sc.next();
				
				int result = taroCard.compareTo(hanakoCard);
				
				if(result < 0) {
					hanakoPoint += 3;
				} else if(result == 0) {
					taroPoint++;
					hanakoPoint++;
				} else {
					taroPoint += 3;
				}
			}
			
			System.out.println(taroPoint + " " + hanakoPoint);
		}
	}
}
