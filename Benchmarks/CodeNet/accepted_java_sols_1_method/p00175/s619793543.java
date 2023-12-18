import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == -1){
				break;
			}
			
			System.out.println(Integer.toString(n, 4));
		}
		
	}

}