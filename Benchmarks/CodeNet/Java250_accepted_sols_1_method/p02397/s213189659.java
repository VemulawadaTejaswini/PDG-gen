import java.util.*;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a ,b;
		int count = 0;
		while(true){
			a = scanner.nextInt();
			b = scanner.nextInt();
			if(a == 0 && b == 0){break;}
			if(a > b){
				System.out.println(b + " " + a);
			}
			else{
				System.out.println(a + " " + b);
			}
				
		}
		scanner.close();
		
		
	}

}