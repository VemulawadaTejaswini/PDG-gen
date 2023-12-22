import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while(true){
			String s = scanner.next();
			
			if(s.equals("-")){
				break;
			}
			
			int m = scanner.nextInt();

			for(int i = 0; i < m; i++){
				int n = scanner.nextInt();
				s += s.substring(0,n);
				s = s.substring(n);
			}

			System.out.println(s);
		}
	}
}