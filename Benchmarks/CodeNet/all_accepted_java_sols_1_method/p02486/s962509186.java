import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			int n = stdIn.nextInt();
			int x = stdIn.nextInt();
			if(n == 0 && x == 0) break;
			int count = 0;
			for(int r = 1; r <= n; r++) {
				for(int c = r + 1; c <= n; c++) {
					for(int k = c + 1; k <= n; k++) {
						if(r + c + k == x)
							count++;
					}
				}
			}
			
			System.out.println(count);
		}
	}

}