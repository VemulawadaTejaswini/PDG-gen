import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int temp = -1;
		
		for(int i = 1 ; i <= 9 ;i++) {
			for(int j = 1 ; j <= 9 ;j++) {
				int ans  = i * j;
				if(ans == n) {
					temp = 0;
					break;
				}
			}
		}
		
		if(temp == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
