import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int time = sc.nextInt();
		
		int c_min = 1001;
		
		for(int i = 0 ; i < n ; i++) {
			
			int c = sc.nextInt();
			int t = sc.nextInt();
			
			if(t <= time ){
				if(c < c_min){
					c_min = c;
				}
			}
			
		}
		
		if(c_min >= 1001) {
			System.out.println("TLE");
		} else {
			System.out.println(c_min);
		}
	}
}
