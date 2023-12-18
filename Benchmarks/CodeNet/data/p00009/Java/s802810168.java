import java.util.Scanner;
public class Main {

	//??????????????????????????°
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int yakusuu = 0;
		int sosuu = 0;
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <=i; j++ ) {
				
				if(i % j == 0) {
					
					yakusuu++;
					
				}
				
			}
			
			if(yakusuu == 2) {
				sosuu++;
			}
			yakusuu = 0;
		}
		System.out.println(sosuu);
	}

}