
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = a + b;
			int count = 1;
		
			while(c/10!=0){
				count++;
				c = c/10;
			}
		
			System.out.println(count);
		}
	}
}