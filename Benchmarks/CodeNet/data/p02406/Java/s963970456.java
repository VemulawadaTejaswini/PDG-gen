import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		
		for (int i = 3; i <= n; i++) {
			x = i;
			//3????????°?????????
			if(i%3 == 0){
				System.out.print(" "+i);
			}
			else{
				while (x != 0) {
					if(x%10 == 3){
						System.out.print(" "+i);
						break;
					}
					x = x/10;
				}
			}
		}
	}
}