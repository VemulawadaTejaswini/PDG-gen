import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		int take = 0;
		int howmany = scan.nextInt();
		
		for(int i = 0; i < howmany;i++) {
			take += scan.nextInt();
			
		}
		
		if(take > day){
			System.out.println(-1);
			
		}else {
			System.out.println(day - take);
			
		}
		
		
	}
}

