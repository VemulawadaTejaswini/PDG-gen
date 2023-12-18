import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			long count = 0;
			for(int i =1;i<=N;i++) {
				if(i%3!=0&&i%5!=0) {
					count+=i;
				}
			}
			
			System.out.println(count);
			
		}
		
		
	}
		
	

}