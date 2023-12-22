import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			final int t = sc.nextInt();
			
			if(t == 0){
				break;
			}
			
			final int n = sc.nextInt();
			
			int time = t;
			for(int i = 0; i < n; i++){
				int start = sc.nextInt();
				int end = sc.nextInt();
				
				time -= end - start;
			}
			
			if(time <= 0){
				System.out.println("OK");
			}else{
				System.out.println(time);
			}
						
		}
	}

}