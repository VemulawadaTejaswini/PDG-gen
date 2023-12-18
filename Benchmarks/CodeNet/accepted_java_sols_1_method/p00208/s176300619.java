
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			String oct = Integer.toOctalString(n);
			char[] trans = new char[]{'0', '1', '2', '3', '5', '7', '8', '9'};
			
			
			for(char c : oct.toCharArray()){
				System.out.print(trans[c - '0']);
			}
			System.out.println();
		}
		
	}

}