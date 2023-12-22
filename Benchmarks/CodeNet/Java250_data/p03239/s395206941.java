import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int T = scan.nextInt();
		
		int c ;
		int min_c = 0;
		int t ;
		
		
		for (int i = 0 ; i < N ;i++){
			c = scan.nextInt();
			t = scan.nextInt();
			
			if(t <= T){
				if( min_c==0 || c < min_c){
					min_c = c;
				}
			}
		}
		
		if (min_c == 0){
			System.out.println("TLE"); 
		}
		else{
			System.out.println(min_c); 	
		}
	}
}