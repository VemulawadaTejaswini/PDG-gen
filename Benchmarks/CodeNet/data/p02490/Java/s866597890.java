import java.util.Scanner;

public class Aoj10007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x+y == 0)break;
			if(x < y){
				System.out.println(x + " " + y);
			}
			else if(x > y){
				System.out.println(y + " " + x);
			}
			
			else if(x == y){
				System.out.println(x + " " + y);
			}
		}
		
	}
}