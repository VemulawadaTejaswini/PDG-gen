import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt(); //動物の数
		
		int y = stdIn.nextInt(); //足の本数
		
		boolean flag = false;
		
		
		for(int i = 0; i <= x; i++) {
			for(int j = 0; j <= x-i; j++) {
				
				if(i*2+j*4 == y) {
					flag = true;
				}
				
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
